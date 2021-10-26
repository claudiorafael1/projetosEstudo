<jsp:include page="cabecalho.jsp"/>

<% String pag = "categorias";%>

<div class="container">
    <div class="row mt-4 mb-4">
        <a type="button" class="btn-info sm ml-3" href="<%=pag%>.jsp?funcao=novo">Nova Categoria</a>
        <form class="form-inline my-2 my-lg-0 direita" method="get">

            <input class="form-control form-control-sm mr-sm-2" type="search" id="txtbuscar" name="txtbuscar" placeholder="Buscar pelo nome">
            <button class="btn btn-outline-info btn-sm my-2 my-sm-0 d-none d-md-block" type="submit" id="btn-buscar" name="btn-buscar">Buscar</button>
        </form>      
    </div>


<div id="listar">
</div>

    <!-- Modal -->
    <div class="modal fade" id="modalDados" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="modalDados">Modal title</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>


                <div class="modal-body">
                    <form>
                        <div class="form-group">
                            <label >Nome</label>
                            <input type="text" class="form-control" id="nome" name="nome" placeholder="Nome">
                            <label >Descrição</label>
                            <input type="text" class="form-control" id="descricao" name="descricao" placeholder="descricao">
                        </div>

                        <div class="form-group">
                            <label for="">Imagem</label>
                            <input type="file" class="form-control-file" id="imagem" name="imagem">
                        </div>

                    </form>
                    <div id="mensagem">


                    </div>

                    <div id="listar">


                    </div>
                  
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                        <button type="button" id="btn-salvar" name="btn-salvar" class="btn btn-primary">Salvar</button>
                    </div>
                </div>
            </div>
            </div>
        
    </div>
    <script>
console.log("oi");
</script>          
<%
                if (request.getParameter(
                        "funcao") != null && request.getParameter("funcao").equals("novo")) {
                    out.print("<script>$('#modalDados').modal('show'); </script>");
                }


            %>

                                 



            <!--AJAX para inserir Dados -->
            <script type="text/javascript">
    $(document).ready(function () {
        var pag = "<%=pag%>";
        console.log(pag);
        $('btn-salvar').click(function (event) {
            event.preventDefault();

            $.ajax({
                url: pag +"/inserir.jsp",
                method: "post",
                data: $('form').serialize(),
                dataType: "text",
                success: function (mensagem) {
                    $('#mensagem').removeClass();
                    if (messagem === 'Retornando Algo') {
                        $('#nome').val('');

                        $('#btn-buscar').click();
                    } else {

                        $('#mensagem').addClass("text-danger");
                    }
                    $('#mensagem').text(mensagem);
                },
            });

        });

    })