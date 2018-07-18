<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="stylesheet" href="css/styles.css"/>

        <title>JSP Page</title>
        <style>
            .mt {
                margin-top: 100px;
            }
        </style>
    </head>
    <body>

        <jsp:include page="WEB-INF/dynamic/nav.jsp">
            <jsp:param name="select" value="login" />
        </jsp:include>

        <main>
            <div class="container mt">
                <div class="row">
                    <div class="card col s10 push-s1 m8 push-m2">
                        <form action="/clientes" method="POST">
                            <div class="card-content">
                                <span class="card-title">Registro Clinte</span>
                                <div class="row" style="margin-bottom: 0">
                                    <div class="input-field col s6">
                                        <label for="nombre">Nombre</label>
                                        <input type="text" name="nombre" id="nombre" />
                                    </div>
                                    <div class="input-field col s6">
                                        <label for="apellido">Apellido</label>
                                        <input type="text" name="apellido" id="apellido" />
                                    </div>
                                    <div class="input-field col s6">
                                        <label for="rut">Rut</label>
                                        <input type="number" name="rut" id="rut" />
                                    </div>

                                    <div class="input-field col s6">
                                        <label for="email">email</label>
                                        <input type="email" name="email" id="email"/>
                                    </div>

                                    <div class="input-field col s6">
                                        <label for="password">Contraseña</label>
                                        <input type="password" name="password" id="password" />
                                    </div>
                                    <div class="input-field col s6">
                                        <label for="repetir_password">Repetir Contraseña</label>
                                        <input type="password" name="repetir_password" id="repetir_password" />
                                    </div>
                                    <div class="input-field col s6 push-m3">
                                        <label for="cel">Nº Celular</label>
                                        <input type="number" name="cel" id="cel" />
                                    </div>
                                </div>
                                <center>
                                    ${msgu}
                                </center>
                            </div>
                            <div class="card-action">
                                <input type="submit" value="Crear" name="btn" class="btn deep-purple lighten-1" style="width: 100%; margin-bottom: 1em" />     
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </main>

        <!--JavaScript at end of body for optimized loading-->
        <script
        src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script>
            $(document).ready(function () {
                $('.sidenav').sidenav();
            });
            $(document).ready(function () {
                $('input#input_text, textarea#textarea2').characterCounter();
            });
        </script>
    </body>
</html>
