/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.31
 * Generated at: 2019-05-15 21:15:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("jar:file:/D:/PAF/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/paf_project/WEB-INF/lib/spring-webmvc-4.3.2.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1469673008000L));
    _jspx_dependants.put("/WEB-INF/views/includes.jsp", Long.valueOf(1556351024928L));
    _jspx_dependants.put("jar:file:/D:/PAF/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/paf_project/WEB-INF/lib/spring-webmvc-4.3.2.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1469673008000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1554495393844L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.2.RELEASE.jar", Long.valueOf(1556274905595L));
    _jspx_dependants.put("jar:file:/D:/PAF/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/paf_project/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- This contains the most used tag libraries -->\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("<script src=\"/resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");

	if(session.getAttribute("email") == null){
		response.sendRedirect("/paf_project/admin");
	}


      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>Admin Dashboard</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"back-rec\" style=\"padding: 0px; margin: 30px;\">\r\n");
      out.write("\t\r\n");
      out.write("\t \r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("\t<div align=\"right\">\r\n");
      out.write("\t\t<form action=\"/paf_project/adminLogout\" method=\"post\">\r\n");
      out.write("    \t\t\t\t\t\t <input type=\"submit\" value=\"Logout\" class=\"sub_btn\" style = \"width: 100px; height : 30px; margin-top: 20px; margin-right:40px; border-color: black;\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<h1 style=\"font-size: 35px;\">\r\n");
      out.write("\t\t\t\t\t<b style=\"color:white\">Admin Dashboard</b>\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t \t\t\t\t\r\n");
      out.write("\t \t<table align=\"center\" border=\"0\" id=\"but_menu\" width=\"auto\"\r\n");
      out.write("\t\t\theight=\"400px\" cellpadding=\"0px\" cellspacing=\"0px\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan = \"3\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/paf_project/viewAllCustomer\">\r\n");
      out.write("\t\t\t\t\t    <button class=\"btn_dash\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-color: red\">\r\n");
      out.write("\t\t\t\t\t\t\tCustomer Management <br>\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-address-card\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: white; font-size: 30px; margin-top: 10px;  border-radius:10px; font-weight:bold\"></i>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<td><a href=\"/paf_project/viewAllSeller\"><button class=\"btn_dash\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-color: orangered\">\r\n");
      out.write("\t\t\t\t\t\t\tSeller Management <br>\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-bolt\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: white; font-size: 30px; margin-top: 10px;  border-radius:10px; font-weight:bold\"></i>\r\n");
      out.write("\t\t\t\t\t\t</button></a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<td><a href=\"/paf_project/viewAllCategory\"><button class=\"btn_dash\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-color: orange\">\r\n");
      out.write("\t\t\t\t\t\t\tCategory Management <br>\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-bullhorn\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: white; font-size: 30px; margin-top: 10px;  border-radius:10px; font-weight:bold\"></i>\r\n");
      out.write("\t\t\t\t\t\t</button></a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"3\"><a href=\"viewAllPayment\">\r\n");
      out.write("\t\t\t\t\t<button\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn_dash\" style=\"background-color: #0080ff\">\r\n");
      out.write("\t\t\t\t\t\t\tPayment Management <br>\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-gamepad\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: white; font-size: 30px; margin-top: 10px;\"></i>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<a href=\"/paf_project/viewAllShipping\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn_dash\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-color: forestgreen\">\r\n");
      out.write("\t\t\t\t\t\t\tShipping Management <br>\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-calendar-check-o\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: white; font-size: 30px; margin-top: 10px;\"></i>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<a href = \"/paf_project/viewAllProduct\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn_dash\" style=\"background-color: brown\">\r\n");
      out.write("\t\t\t\t\t\tInventory Management <br>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-calendar\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: white; font-size: 30px; margin-top: 10px;\"></i>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t<p align=\"center\" style=\"font-size: 15px;\">\r\n");
      out.write("\t\t\t<b>COPYRIGHT &copy LEARNFEVER 2018 | All Rights Reserved</b>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/adminDashboard.jsp(10,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/resources/css/bootstrap.min.css");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /WEB-INF/views/adminDashboard.jsp(12,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/resources/css/dash.css");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f2_reused = false;
    try {
      _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f2.setParent(null);
      // /WEB-INF/views/adminDashboard.jsp(14,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f2.setValue("/resources/css/customStylesheet.css");
      int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
      if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      _jspx_th_c_005furl_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f2, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f3_reused = false;
    try {
      _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f3.setParent(null);
      // /WEB-INF/views/adminDashboard.jsp(26,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f3.setValue("/resources/images/back1.png");
      int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
      if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      _jspx_th_c_005furl_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f3, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f3_reused);
    }
    return false;
  }
}
