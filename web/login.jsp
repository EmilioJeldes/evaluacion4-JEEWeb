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
        <title>Login</title>
        <style>
            .login-row {
                margin-bottom: 0;
            }
            .login-btn {
                width: 100%
            }
            .login-card {
                width: 100%;
            }
            .mt {
                margin-top: 100px;
            }
            .link {
                background-color: rgba(0,0,0,0);
                border: none;
                color: blue;
                text-decoration: underline;
                cursor: pointer;
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
                    <div class="col card s10 push-s1 m6 push-m3 login-card">
                        <form action="/clientes" method="POST">
                            <div class="card-content">
                                <span class="card-title center">Iniciar Sesion</span>
                                <div class="row login-row">
                                    <div class="input-field col s12">
                                        <label for="rut">Ingresar Rut</label>
                                        <input autofocus="true" type="number" id="rut" class="validate" name="rut">
                                    </div>
                                    <div class="input-field col s12">
                                        <label for="password">Ingresar contraseña</label>
                                        <input type="password" id="password" class="validate" name="password">
                                    </div>
                                </div>
                                <center>
                                    ${msgl}
                                </center>
                            </div>
                            <div class="card-action right-align">
                                <input type="reset" id="restablecer" value="Restablecer" class="waves-effect waves-purple btn-flat">
                                <input type="submit" id="submit" value="Ingresar" name="btn" class="btn  deep-purple lighten-1">
                            </div>
                        </form>
                    </div>
                </div>

                <center>
                    <form action="/clientes" method="POST">
                        <input  type="submit" class="center-align link" value="Crear Cliente" name="btn"/>
                    </form>
                </center>
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
