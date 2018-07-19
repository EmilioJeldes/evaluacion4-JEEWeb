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
        <title>Banca Online</title>
        <style>
            .pl-cuenta {
                margin-left: 20px;
            }
            .img-container {
                z-index: -10;
                position: relative;
            }
            .img-bancaOnline {
                max-width: 100%;
                max-height: 100%;
                z-index: -10;
                position: relative;
            }
            .img-container:after {
                position: absolute;
                top: 0;
                left: 0;
                width: 100%;
                height: 100%;

                z-index: -10;
                content: " ";
            }
            .logo-bancaOnline {
                position: absolute;
                bottom: 10px;
                right: 10px;
                background-color: rgba(255,255,255,.2);
            }
            .index {
                z-index: -10;
            }
        </style>
    </head>
    <body>
        <header class="header">
            <!-- NAV -->
            <jsp:include page="WEB-INF/dynamic/nav_loged.jsp" />
            <!-- END NAV -->
        </header>

        <!-- SIDE NAV -->
        <jsp:include page="WEB-INF/dynamic/sidenav_cuenta.jsp" />
        <!-- SIDE NAV END -->

        <!-- MAIN START -->
        <main class="main">
            <div class="">
                <div class="row container">
                    <div class="col s10 push-m1">
                        <div class="img-container">
                            <img src="img/pexels-photo-938965.jpeg" class="img-bancaOnline" alt="imagen del banco">
                            <img src="img/logo.png" class="logo-bancaOnline index" alt="imagen del logo">
                        </div>
                    </div>

                </div>
                <div class="row container">
                    <div class="col s12">
                        <h4 class="">Bienvenido <c:out value="${cliente.getNombre()} ${cliente.getApellido()}" /></h4>
                        <table class="striped centered">
                            <thead>
                                <tr>
                                    <th>Saldo</th>
                                    <th>Nº Cuenta</th>
                                    <th>Rut</th>
                                    <th>Fecha Apertura</th>
                                    <th>Tipo Cuenta</th>
                                    <th>Modificar</th>
                                </tr>
                            </thead>

                            <tbody>
                                <!-- comment
                                    private Integer numeroCuenta;
    private Date fechaApertura;
    private TipoCuenta tipoCuenta;
    private ClienteDTO cliente;
    private Integer saldoDisponible;

                                -->
                            <input type="hidden" value="<c:out value="${cuenta.getNumeroCuenta()}" />" name="idProducto">
                            <tr>
                                <td><c:out value="$${cuenta.getSaldoDisponible()}" /></td>
                                <td><c:out value="${cuenta.getNumeroCuenta()}" /></td>
                                <td><c:out value="${cliente.getRut()}" /></td>
                                <td><c:out value="${cuenta.getFechaApertura()}" /></td>
                                <td><c:out value="${cuenta.getTipoCuenta().toString()}" /></td>
                                <td><button type="submit" class="btn-icon" name="btn" value="Modificar"><i class="material-icons pointer">edit</i></button></td>
                            </tr>

                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </main>
        <!-- MAIN END -->


        <!--JavaScript at end of body for optimized loading-->
        <script
        src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script>
            $(document).ready(function () {
                $('.sidenav').sidenav();
            });
            $(document).ready(function () {
                $('.slider').slider();
            });
            $(document).ready(function () {
                $('.sidenav').sidenav();
            });
        </script>
    </body>
</html>
