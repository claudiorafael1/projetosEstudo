/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2021-10-16 23:23:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class categorias_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cabecalho.jsp", out, false);
      out.write('\n');
      out.write('\n');
 String pag = "categorias";
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row mt-4 mb-4\">\n");
      out.write("        <a type=\"button\" class=\"btn-info sm ml-3\" href=\"");
      out.print(pag);
      out.write(".jsp?funcao=novo\">Nova Categoria</a>\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0 direita\" method=\"get\">\n");
      out.write("\n");
      out.write("            <input class=\"form-control form-control-sm mr-sm-2\" type=\"search\" id=\"txtbuscar\" name=\"txtbuscar\" placeholder=\"Buscar pelo nome\">\n");
      out.write("            <button class=\"btn btn-outline-info btn-sm my-2 my-sm-0 d-none d-md-block\" type=\"submit\" id=\"btn-buscar\" name=\"btn-buscar\">Buscar</button>\n");
      out.write("        </form>      \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"listar\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <!-- Modal -->\n");
      out.write("    <div class=\"modal fade\" id=\"modalDados\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\" id=\"modalDados\">Modal title</h5>\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                        <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <form>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label >Nome</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"nome\" name=\"nome\" placeholder=\"Nome\">\n");
      out.write("                            <label >Descri????o</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"descricao\" name=\"descricao\" placeholder=\"descricao\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"\">Imagem</label>\n");
      out.write("                            <input type=\"file\" class=\"form-control-file\" id=\"imagem\" name=\"imagem\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                    <div id=\"mensagem\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"listar\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                  \n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancelar</button>\n");
      out.write("                        <button type=\"button\" id=\"btn-salvar\" name=\"btn-salvar\" class=\"btn btn-primary\">Salvar</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("console.log(\"oi\");\n");
      out.write("</script>          \n");

                if (request.getParameter(
                        "funcao") != null && request.getParameter("funcao").equals("novo")) {
                    out.print("<script>$('#modalDados').modal('show'); </script>");
                }


            
      out.write("\n");
      out.write("\n");
      out.write("                                 \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--AJAX para inserir Dados -->\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        var pag = \"");
      out.print(pag);
      out.write("\";\n");
      out.write("        console.log(pag);\n");
      out.write("        $('btn-salvar').click(function (event) {\n");
      out.write("            event.preventDefault();\n");
      out.write("\n");
      out.write("            $.ajax({\n");
      out.write("                url: pag +\"/inserir.jsp\",\n");
      out.write("                method: \"post\",\n");
      out.write("                data: $('form').serialize(),\n");
      out.write("                dataType: \"text\",\n");
      out.write("                success: function (mensagem) {\n");
      out.write("                    $('#mensagem').removeClass();\n");
      out.write("                    if (messagem === 'Retornando Algo') {\n");
      out.write("                        $('#nome').val('');\n");
      out.write("\n");
      out.write("                        $('#btn-buscar').click();\n");
      out.write("                    } else {\n");
      out.write("\n");
      out.write("                        $('#mensagem').addClass(\"text-danger\");\n");
      out.write("                    }\n");
      out.write("                    $('#mensagem').text(mensagem);\n");
      out.write("                },\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    })");
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
}
