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
        <title>Bienvenido</title>
        <style>
            .testimonials-img {
                max-width: 100%;
                max-height: 250px;
            }
        </style>
    </head>
    <body>
        <!-- NAV -->
        <jsp:include page="WEB-INF/dynamic/nav.jsp">
            <jsp:param name="select" value="index" />
        </jsp:include>
        <!-- END NAV -->


        <div class="slider">
            <ul class="slides">
                <li>
                    <img src="/img/Banco-Mundial.jpg"> <!-- random image -->
                    <div class="caption center-align">
                        <h3>Banco Brigido</h3>
                        <h5 class="light grey-text text-lighten-3">Forma parte de la brigidez</h5>
                    </div>
                </li>
                <li>
                    <img src="/img/pexels-photo-1020313-2.jpeg"> <!-- random image -->
                    <div class="caption left-align">
                        <h3>Los mejores standares de calidad</h3>
                        <h5 class="light grey-text text-lighten-3">y los mejores servicios</h5>
                    </div>
                </li>
                <li>
                    <img src="/img/pexels-photo-1056553-2.jpeg"> <!-- random image -->
                    <div class="caption right-align">
                        <h3>Años de experiencia</h3>
                        <h5 class="light grey-text text-lighten-3">y la mejor seguridad</h5>
                    </div>
                </li>
                <li>
                    <img src="/img/pexels-photo-684387.jpeg"> <!-- random image -->
                    <div class="caption center-align">
                        <h3>Hazte cliente ya mismo</h3>
                        <h5 class="light grey-text text-lighten-3">que esperas?</h5>
                        <img src="/img/logo.png" alt="logo">
                    </div>
                </li>
            </ul>
        </div>

        <div class="container">
            <div class="row">
                <div class="col s12 m6">
                    <div class="card">
                        <div class="card-image">
                            <img class="testimonials-img" src="/img/pexels-photo-862730.jpeg" alt="">
                            <span>Titulo 1</span>
                        </div>
                        <div class="card-content">
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sit, quisquam, assumenda, aliquam veniam accusantium maxime sapiente aspernatur et ullam illum soluta commodi. Nisi, voluptatem, iste dicta magnam delectus temporibus blanditiis?</p>
                        </div>
                    </div>
                </div>
                <div class="col s12 m6">
                    <div class="card">
                        <div class="card-image">
                            <img class="testimonials-img" src="/img/pexels-photo-938965.jpeg" alt="">
                            <span>Titulo 1</span>
                        </div>
                        <div class="card-content">
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sit, quisquam, assumenda, aliquam veniam accusantium maxime sapiente aspernatur et ullam illum soluta commodi. Nisi, voluptatem, iste dicta magnam delectus temporibus blanditiis?</p>
                        </div>
                    </div>
                </div>

            </div>
        </div>


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
        </script>
    </body>
</html>
