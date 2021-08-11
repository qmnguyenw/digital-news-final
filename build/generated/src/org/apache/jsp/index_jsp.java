package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"public/css/style.css\">\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Main Wrapper -->\n");
      out.write("        <div class=\"main-wrapper no-collapse\">\n");
      out.write("            <!-- Header -->\n");
      out.write("            <div class=\"no-collapse\">\n");
      out.write("                <div class=\"preheader no-repeat\"></div>\n");
      out.write("                <div class=\"header no-collapse no-repeat\">\n");
      out.write("                    <p class=\"font-sans title pt-025 pl-5 font-bold white\">My Digital News</p>\n");
      out.write("                </div>\n");
      out.write("                <!-- Navigation -->\n");
      out.write("                <div class=\"navigation no-repeat flex\">\n");
      out.write("                    <a href=\"#\" class=\"ml-5 a-reset pointer\"><p class=\"font-sans menu-child mt-05 font-bold white\">News</p></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Main Body -->\n");
      out.write("            <div class=\"main-body no-collapse flex pt-05 pr-4 pb-1\">\n");
      out.write("                <div class=\"left pl-5 pr-1\">\n");
      out.write("                    <p class=\"title-article font-sans font-bold no-collapse\">Making security feeds smarter via\n");
      out.write("                        machine learning</p>\n");
      out.write("                    <img class=\"img-article\" src=\"public/img/i1.jpg\">\n");
      out.write("                    <p class=\"content-article font-sans pb-1\">Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.</p>\n");
      out.write("                    <p class=\"author-article font-sans pt-05\"><img class=\"pr-05\" src=\"public/img/comment.gif\">By Quang Huy Pham | January 15 2019 - 00:00am</p>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"right pl-1 no-collapse\">\n");
      out.write("                    <p class=\"title-article font-sans font-bold\">Digital News</p>\n");
      out.write("                    <p class=\"content-article font-sans mb-025\">Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classi...</p>\n");
      out.write("                    <p class=\"title-article font-sans font-bold mt-05\">Search</p>\n");
      out.write("                    <form class=\"mt-025\">\n");
      out.write("                        <input type=\"text\" class=\"search-box\">\n");
      out.write("                        <input type=\"submit\" value=\"Go\" class=\"submit-bt font-sans ml-025\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Footer -->\n");
      out.write("            <div class=\"footer no-repeat\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End of Main Wrapper -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
