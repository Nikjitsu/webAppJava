/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-02-10 07:23:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<div class=\"right sidebar\" id=\"sidebar\">\n");
      out.write("    <div class=\"section\">\n");
      out.write("        <div class=\"section-content\">\n");
      out.write("            <h2>Useful links</h2>\n");
      out.write("            <ul class=\"nice-list\">\n");
      out.write("                <li><a href=\"http://projects.spring.io/spring-security-saml/\">Homepage <span class=\"quiet\">(Spring)</span></a></li>\n");
      out.write("                <li><a href=\"https://github.com/spring-projects/spring-security-saml\">Sources <span class=\"quiet\">(GitHub)</span></a></li>\n");
      out.write("                <li><a href=\"http://docs.spring.io/spring-security-saml/docs/\">Documentation <span class=\"quiet\">(Spring)</span></a></li>\n");
      out.write("                <li><a href=\"https://jira.spring.io/browse/SES/component/10711/\">Issue tracking <span class=\"quiet\">(Jira)</span></a></li>\n");
      out.write("                <li><a href=\"https://build.springsource.org/browse/SES\">Continuous integration <span class=\"quiet\">(Bamboo)</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"section-content\">\n");
      out.write("            <h2>Support</h2>\n");
      out.write("            <ul class=\"nice-list\">\n");
      out.write("                <li><a href=\"http://stackoverflow.com/questions/tagged/spring-saml\">Community <span class=\"quiet\">(Stackoverflow)</span></a></li>\n");
      out.write("                <li><a href=\"mailto:vladimir@v7security.com\">Commercial <span class=\"quiet\">(V7 Security)</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"section-content\">\n");
      out.write("            <h2>Releases</h2>\n");
      out.write("            <ul class=\"nice-list\">\n");
      out.write("                <li><a href=\"http://repo.spring.io/list/release/org/springframework/security/extensions/\">Final releases <span class=\"quiet\">(Spring)</span></a></li>\n");
      out.write("                <li><a href=\"http://repo.spring.io/list/milestone/org/springframework/security/extensions/\">Milestone releases <span class=\"quiet\">(Spring)</span></a></li>\n");
      out.write("                <li><a href=\"http://repo.spring.io/list/snapshot/org/springframework/security/extensions/\">Snapshot releases <span class=\"quiet\">(Spring)</span></a></li>                \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"clearer\">&nbsp;</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
