<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String select = request.getParameter("select");
%>
<!-- NAV -->
<nav class="grey lighten-5">
    <div class="nav-wrapper container black-text" style="max-height: 100%; max-width: 100%;">
        <a href="/" class="brand-logo"><img class="logo" src="/img/logo.png" alt="Logo image"></a>
        <a href="/" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
        <ul class="right hide-on-med-and-down black-text">
            <li><a class="waves-effect btn waves-light blue lighten-1" href="/clientes">Hazte Cliente</a></li>
            <li><a class="waves-effect btn waves-light deep-purple lighten-1" href="/cuenta">Ingresar</a></li>
        </ul>
    </div>
</nav>

<ul class="sidenav" id="mobile-demo">
    <li class="<%out.print(select.equals("index") ? "active" : ""); %>">
        <a class="waves-effect btn waves-light blue lighten-1" href="/">Hazte Cliente</a>
    </li>
    <li class="<%out.print(select.equals("login") ? "active" : "");%>">
        <a class="waves-effect btn waves-light deep-purple lighten-1" href="/cuenta">Ingresar</a>
    </li>
</ul>