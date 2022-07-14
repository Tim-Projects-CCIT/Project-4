package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.TransactionController;
import java.sql.ResultSet;

public final class transaction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Homepage", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"d-flex flex-column h-100\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        ");

            TransactionController tc = new TransactionController();

            String search = "";
            ResultSet rs;

            if (request.getParameter("search") != null) {
                search = request.getParameter("search");
            } 

            if (search.equals("")) {
                rs = tc.get();
            } else {
                rs = tc.getByName(search);
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Begin page content -->\n");
      out.write("        <main class=\"flex-shrink-0\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1 class=\"mt-5\">Sticky footer with fixed navbar</h1>\n");
      out.write("                <p class=\"lead\">Pin a footer to the bottom of the viewport in desktop browsers with this custom HTML and CSS. A fixed navbar has been added with <code class=\"small\">padding-top: 60px;</code> on the <code class=\"small\">main &gt; .container</code>.</p>\n");
      out.write("                <div class=\"row pt-5\">\n");
      out.write("                    <div class=\"col-6\">\n");
      out.write("                        <form action=\"tr\" method=\"GET\">\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label class=\"form-label\">Search</label>\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"search\" value=\"");
      out.print( search);
      out.write("\" />\n");
      out.write("                                    <span class=\"input-group-append\">\n");
      out.write("                                        <button class=\"input-group-text bg-light d-block\">\n");
      out.write("                                            <i class='bx bxs-search'></i>\n");
      out.write("                                        </button>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row pt-5\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <table class=\"table table-striped table-hover\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                <th>No.</th>\n");
      out.write("                                <th>admin_id</th>\n");
      out.write("                                <th>Product_id</th>\n");
      out.write("                                <th>type</th>\n");
      out.write("                                <th>total_items</th>\n");
      out.write("                                <th>transaction_date</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
 while(rs.next()) { 
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( rs.getString("id") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( rs.getString("admin_id") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( rs.getString("product_id") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( rs.getString("type") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( rs.getString("total_items") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( rs.getString("transaction_date") );
      out.write("</td>\n");
      out.write("                                <td> \n");
      out.write("                                    <form action=\"delete_tr?id=");
      out.print( rs.getString("id") );
      out.write("\" method=\"POST\"\n");
      out.write("                                              onsubmit=\"return confirm('Are you sure want to delete the data?')\"\n");
      out.write("                                        >\n");
      out.write("                                            \n");
      out.write("                                            <input type=\"hidden\" name=\"id\" value=\"");
      out.print( rs.getString("id"));
      out.write("\" />\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-sm btn-danger\">Delete</button>\n");
      out.write("                                        </form>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/footer.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/scripts.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
