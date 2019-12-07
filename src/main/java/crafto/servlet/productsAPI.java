package crafto.servlet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crafto.model.File;
import crafto.model.Product;
import crafto.util.DbUtils;

@WebServlet(urlPatterns = "/productsAPI/*", loadOnStartup = 1)
public class productsAPI extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public productsAPI() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new ServletException(e);
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uri = request.getRequestURI();
		int id = Integer.parseInt(uri.substring(uri.lastIndexOf("/") + 1));
		System.out.print(id);
		
		// Get object from database
        DbUtils dbUtils = new DbUtils();
        //File file = dbUtils.getFile( id );
		List<Product> products = new ArrayList<Product>();
		products = dbUtils.getProducts(id);
        dbUtils.close();
        
        int i = 0;
        StringBuilder sb = new StringBuilder();
        sb.append( "{\"items\":[" );
        for (Product product : products) {
        	// Create a JSON object and
              if (i == 0) {
            	  sb.append( "{" );
			    }
              else {
                  sb.append( ",{" );
			}
              i++;
              sb.append( "\"id\":" )
                .append( product.getID() )
                .append( "," )
                .append( "\"name\":\"" )
                .append( product.getName() )
                .append( "\"," )
                .append( "\"description\":\"" )
                .append( product.getDescription() )
                .append( "\"," )
                .append( "\"price\":" )
                .append( product.getPrice() )
                .append( "," )
                .append( "\"imge\":\"" )
                .append( product.getImage() )
                .append( "\"," )
                .append( "\"seller_id\":" )
                .append( product.getSeller_id())
                .append( "}" );
		}
        sb.append( "]}" );


        // Set back the JSON object in response
        response.setContentType( "application/json" );
        response.getWriter().print( sb.toString() );
        products.clear();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
