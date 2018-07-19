<%@page import="cl.inacap.domain.TipoCuenta"%>
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

        <!-- 
            private Integer numeroCuenta;
            private Date fechaApertura;
            private TipoCuenta tipoCuenta;
            private ClienteDTO cliente;
            private Integer saldoDisponible;
        
        style="margin-right: 20px;"
        -->
        <!-- MAIN START -->
        <main class="main">
            <div class="container mt-50">
                <div class="row">
                    <div class="card col s12">
                        <form action="/cuenta" method="POST">
                            <div class="card-content">
                                <span class="card-title">Registro Cuenta</span>
                                <div class="row" style="margin-bottom: 0">
                                    <div class="input-field col s8 push-m2">
                                        <label for="numeroCuenta">Nº Cuenta</label>
                                        <input disabled type="number" name="numeroCuenta" id="numeroCuenta" />
                                    </div>
                                    <div class="input-field col s8 push-m2">
                                        <select name="tipoCuenta" id="tipoCuenta">
                                            <option value="" disabled selected>Tipo Cuenta</option>
                                            <option value="<%= TipoCuenta.CORRIENTE.toString()%>"><%= TipoCuenta.CORRIENTE.toString()%></option>
                                            <option value="<%= TipoCuenta.AHORRO.toString()%>"><%= TipoCuenta.AHORRO.toString()%></option>
                                            <option value="<%= TipoCuenta.VISTA.toString()%>"><%= TipoCuenta.VISTA.toString()%></option>
                                        </select>
                                    </div>
                                    <div class="input-field col s8 push-m2">
                                        <label for="saldoDisponible">Saldo inicial</label>
                                        <input type="number" name="saldoDisponible" id='saldoDisponible'>
                                    </div>
                                    <input type="hidden" value="<c:out value="${cliente.getRut()}" />">
                                </div>
                                <center>
                                    ${msgc}
                                </center>
                            </div>
                            <div class="card-action">
                                <div class="row">
                                    <div class="col s8 push-m2">
                                        <input type="submit" value="Registrar" name="btn" class="btn deep-purple lighten-1" style="width: 100%; margin-bottom: 1em" />     
                                    </div>
                                </div>
                            </div>
                        </form>
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
            $(document).ready(function () {
                $('select').formSelect();
            });
        </script>
    </body>
</html>
