<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Categorias</title>
    </head>
    <body>
       <div class="container">
           
           <button type="submit" class="btn btn-info">Info</button>
            <!--->
            <button class="btn btn-outline-info btn-sm my-2 my-sm-0 d-none d-md-block" type="submit" id="btn-buscar" name="btn-buscar">Buscar</button>
            -->
    </div>
        
        
        
        
        <!-- Modal -->
    <div class="modal fade" id="modalDados" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
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
                   
                  
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                        <button type="button" id="btn-salvar" name="btn-salvar" class="btn btn-primary">Salvar</button>
                    </div>
                </div>
            </div>
            </div>
        
    </div>

        
    </body>
</html>
