<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta charset="utf-8">
      <meta name="robots" content="all,follow">
      <meta name="googlebot" content="index,follow,snippet,archive">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="description" content="Obaju e-commerce template">
      <meta name="author" content="Ondrej Svestka | ondrejsvestka.cz">
      <meta name="keywords" content="">

      <title>
          Jebouquine : Millions of books from all over the world
      </title>

      <meta name="keywords" content="">

      <link href='http://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100' rel='stylesheet' type='text/css'>

      <!-- styles -->
      
     <spring:url value="/resources/core/css/font-awesome.css" var="fontawesomeCss" />
	 <spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
	 <spring:url value="/resources/core/css/owl.carousel.css" var="awlcarouselCss" />
	 <spring:url value="/resources/core/css/animate.min.css" var="animateCss" />
	 <spring:url value="/resources/core/css/owl.theme.css" var="owlthemeCss" />
	 <spring:url value="/resources/core/css/style.default.css" var="defaultCss"  />
	 <spring:url value="/resources/core/css/respond.min.js" var="respondCss"  />
	 
	 
	 <link href="${fontawesomeCss}" rel="stylesheet" />
	<link href="${bootstrapCss}" rel="stylesheet" />
	<link href="${awlcarouselCss}" rel="stylesheet" />
	<link href="${animateCss}" rel="stylesheet" />
	 <link href="${owlthemeCss}" rel="stylesheet" />
	<link href="${defaultCss}" rel="stylesheet" id="theme-stylesheet"/>
	 <link href="${owlthemeCss}" rel="stylesheet" />
	 
	 

     


        
      <link rel="shortcut icon" href="favicon.png">



</head>
<body>

    <!-- *** TOPBAR ***
 _________________________________________________________ -->
    <div id="top">
        <div class="container">
            <div class="col-md-6 offer" data-animate="fadeInDown">
                <a href="#" class="btn btn-success btn-sm" data-animate-hover="shake">Offer of the day</a>  <a href="#">Get flat 35% off on orders over $50!</a>
            </div>
            <div class="col-md-6" data-animate="fadeInDown">
                <ul class="menu">
                    <li><a href="#" data-toggle="modal" data-target="#login-modal">Login</a>
                    </li>
                    <li><a href="register.html">Register</a>
                    </li>
                    <li><a href="contact.html">Contact</a>
                    </li>
                    <li><a href="#">Recently viewed</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="Login" aria-hidden="true">
            <div class="modal-dialog modal-sm">

                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title" id="Login">Customer login</h4>
                    </div>
                    <div class="modal-body">
                        <form:form action="customerOrders" modelAttribute="connexionForm"  method="post">
                            <div class="form-group">
                                <form:input type="text" path="email" class="form-control" id="email-modal" placeholder="email" />
                            </div>
                            <div class="form-group">
                                <form:input type="password" path="password" class="form-control" id="password-modal" placeholder="password" />
                            </div>

                            <p class="text-center">
                                <button class="btn btn-primary" type="submit"><i class="fa fa-sign-in"></i> Log in</button>
                            </p>

                        </form:form>

                        <p class="text-center text-muted">Not registered yet?</p>
                        <p class="text-center text-muted"><a href="register.html"><strong>Register now</strong></a>! It is easy and done in 1&nbsp;minute and gives you access to special discounts and much more!</p>

                    </div>
                </div>
            </div>
        </div>

    </div>

    <!-- *** TOP BAR END *** -->

    <!-- *** NAVBAR ***
 _________________________________________________________ -->

    <div class="navbar navbar-default yamm" role="navigation" id="navbar">
        <div class="container">
            <div class="navbar-header">

                <a class="navbar-brand home" href="index.html" data-animate-hover="bounce">
                    <img src="<c:url value='/resources/core/img/logo.png'/>" alt="Obaju logo" class="hidden-xs">
                    <img src="<c:url value='/resources/core/img/logo-small.png'/>" alt="Obaju logo" class="visible-xs"><span class="sr-only">Obaju - go to homepage</span>
                </a>
                <div class="navbar-buttons">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation">
                        <span class="sr-only">Toggle navigation</span>
                        <i class="fa fa-align-justify"></i>
                    </button>
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#search">
                        <span class="sr-only">Toggle search</span>
                        <i class="fa fa-search"></i>
                    </button>
                    <a class="btn btn-default navbar-toggle" href="basket.jsp">
                        <i class="fa fa-shopping-cart"></i>  <span class="hidden-xs">3 items in cart</span>
                    </a>
                </div>
            </div>
            <!--/.navbar-header -->

            <div class="navbar-collapse collapse" id="navigation">

                <ul class="nav navbar-nav navbar-left">
                    <li class="active"><a href="index.html">Home</a>
                    </li>
                    <li class="dropdown yamm-fw">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">All Categories <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="yamm-content">
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <h5>New Arrivals</h5>
                                            <ul>
                                                <li><a href="category.html">Arts & Photography</a>
                                                </li>
                                                <li><a href="category.html">Biography & Memoirs</a>
                                                </li>
                                                <li><a href="category.html">Comics & Graphic novels</a>
                                                </li>
                                                <li><a href="category.html">Computer & Technology</a>
                                                </li>
                                                <li><a href="category.html">Engineering & Transportation</a>
                                                </li>
                                                <li><a href="category.html">Humor & Entertainment</a>
                                                </li>
                                                <li><a href="category.html">Litterature & fiction</a>
                                                </li>
                                                <li><a href="category.html">Romance</a>
                                                </li>
                                                 <li><a href="category.html">Science fiction & Fantasy</a>
                                                </li>
                                                
                                            </ul>
                                        </div>
                                        <div class="col-sm-3">
                                            <h5>BestSellers</h5>
                                            <ul>
                                                <li><a href="category.html">English bestsellers</a>
                                                </li>
                                                <li><a href="category.html">French bestsellers</a>
                                                </li>
                                                <li><a href="category.html">Orient bestsellers</a>
                                                </li>
                                                <li><a href="category.html">Other language bestsellers</a>
                                                </li>
                                            </ul>
                                        </div>
                                        <div class="col-sm-3">
                                            <h5>Award Winners</h5>
                                            <ul>
                                                <li><a href="category.html">Literary Fiction</a>
                                                </li>
                                                <li><a href="category.html">General Nonfiction</a>
                                                </li>
                                                <li><a href="category.html">Children's Books</a>
                                                </li>
                                                <li><a href="category.html">Cooking and Gardening</a>
                                                </li>
                                                <li><a href="category.html">Mystery</a>
                                                </li>
                                                <li><a href="category.html">Sci-Fi and Fantasy</a>
                                                </li>
                                                <li><a href="category.html">Poetry</a>
                                                </li>
                                            </ul>
                                        </div>
                                        <div class="col-sm-3">
                                            <h5>Sale Books</h5>
                                            <ul>
                                                <li><a href="category.html">Litterature</a>
                                                </li>
                                                <li><a href="category.html">Mystery</a>
                                                </li>
                                                <li><a href="category.html">Science Fiction and Fantasy</a>
                                                </li>
                                                <li><a href="category.html">Business</a>
                                                </li>
                                            </ul>
                                            <h5>Indiespensable</h5>
                                            <ul>
                                                <li><a href="category.html">Indiespensable</a>
                                                </li>
                                                
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- /.yamm-content -->
                            </li>
                        </ul>
                    </li>

                    <li class="dropdown yamm-fw">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Used <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="yamm-content">
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <h5>All Categories</h5>
                                            <ul>
                                                <li><a href="category.html">Arts & Photography</a>
                                                </li>
                                                <li><a href="category.html">Biography & Memoirs</a>
                                                </li>
                                                <li><a href="category.html">Comics & Graphic novels</a>
                                                </li>
                                                <li><a href="category.html">Computer & Technology</a>
                                                </li>
                                                <li><a href="category.html">Engineering & Transportation</a>
                                                </li>
                                                <li><a href="category.html">Humor & Entertainment</a>
                                                </li>
                                                <li><a href="category.html">Litterature & fiction</a>
                                                </li>
                                                <li><a href="category.html">Romance</a>
                                                </li>
                                                 <li><a href="category.html">Science fiction & Fantasy</a>
                                                </li>
                                            </ul>
                                        </div>
                                        
                                        <div class="col-sm-3">
                                            <div class="banner">
                                                <a href="#">
                                              
                                                    <img src="<c:url value='/resources/core/img/banner.jpg'/>" class="img img-responsive" alt="">
                                                </a>
                                            </div>
                                            <div class="banner">
                                                <a href="#">
                                                    <img src="<c:url value='/resources/core/img/banner2.jpg'/>" class="img img-responsive" alt="">
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- /.yamm-content -->
                            </li>
                        </ul>
                    </li>

                    <li class="dropdown yamm-fw">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Staff Picks<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="yamm-content">
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <h5>All</h5>
                                            <ul>
                                                <li><a href="index.html">Staff Picks</a>
                                                </li>
                                                <li><a href="category.html">Staff top five</a>
                                                </li>
                                                <li><a href="category-right.html">The short list</a>
                                                </li>
                                                <li><a href="category-full.html">indiespensable</a>
                                                </li>
                                                <li><a href="detail.html">25 books to read before you die</a>
                                                </li>
                                            </ul>
                                        </div>
                                        
                                        
                                    </div>
                                </div>
                                <!-- /.yamm-content -->
                            </li>
                        </ul>
                    </li>
                    
                    
                                        <li class="dropdown yamm-fw">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Admin<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="yamm-content">
                                    <div class="row">                                      
                                        <div class="col-sm-3">
                                            <h5>User</h5>
                                            <ul>
                                                <li><a href="register.html">View all books</a>
                                                </li>
                                                <li><a href="customer-orders.html">Add a book</a>
                                                </li>
                                                <li><a href="customer-order.html">Delete a book</a>
                                                </li>
                                                
                                            </ul>
                                                                                    </div>
                                        
                                    </div>
                                </div>
                                <!-- /.yamm-content -->
                            </li>
                        </ul>
                    </li>
                    
                    
                </ul>

            </div>
            <!--/.nav-collapse -->

            <div class="navbar-buttons">

                <div class="navbar-collapse collapse right" id="basket-overview">
                    <a href="basket.html" class="btn btn-primary navbar-btn"><i class="fa fa-shopping-cart"></i><span class="hidden-sm">3 items in cart</span></a>
                </div>
                <!--/.nav-collapse -->

                <div class="navbar-collapse collapse right" id="search-not-mobile">
                    <button type="button" class="btn navbar-btn btn-primary" data-toggle="collapse" data-target="#search">
                        <span class="sr-only">Toggle search</span>
                        <i class="fa fa-search"></i>
                    </button>
                </div>

            </div>

            <div class="collapse clearfix" id="search">

                <form class="navbar-form" role="search">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Search">
                        <span class="input-group-btn">

			<button type="submit" class="btn btn-primary"><i class="fa fa-search"></i></button>

		    </span>
                    </div>
                </form>

            </div>
            <!--/.nav-collapse -->

        </div>
        <!-- /.container -->
    </div>
    <!-- /#navbar -->

    <!-- *** NAVBAR END *** -->



    <div id="all">

        <div id="content">

            <div class="container">
                <div class="col-md-12">
                    <div id="main-slider">
                        <div class="item">
                            <img src="<c:url value='/resources/core/img/main-slider1.jpg'/>" alt="" class="img-responsive">
                        </div>
                        <div class="item">
                            <img class="img-responsive" src="<c:url value='/resources/core/img/main-slider2.jpg'/>" alt="">
                        </div>
                        <div class="item">
                            <img class="img-responsive" src="<c:url value='/resources/core/img/main-slider3.jpg'/>" alt="">
                        </div>
                        <div class="item">
                            <img class="img-responsive" src="<c:url value='/resources/core/img/main-slider4.jpg'/>" alt="">
                        </div>
                    </div>
                    <!-- /#main-slider -->
                </div>
            </div>

            <!-- *** ADVANTAGES HOMEPAGE ***
 _________________________________________________________ -->
            <div id="advantages">

                <div class="container">
                    <div class="same-height-row">
                        <div class="col-sm-4">
                            <div class="box same-height clickable">
                                <div class="icon"><i class="fa fa-heart"></i>
                                </div>

                                <h3><a href="#">We love our customers</a></h3>
                                <p>We are known to provide best possible service ever</p>
                            </div>
                        </div>

                        <div class="col-sm-4">
                            <div class="box same-height clickable">
                                <div class="icon"><i class="fa fa-tags"></i>
                                </div>

                                <h3><a href="#">Best prices</a></h3>
                                <p>You can check that the height of the boxes adjust when longer text like this one is used in one of them.</p>
                            </div>
                        </div>

                        <div class="col-sm-4">
                            <div class="box same-height clickable">
                                <div class="icon"><i class="fa fa-thumbs-up"></i>
                                </div>

                                <h3><a href="#">100% satisfaction guaranteed</a></h3>
                                <p>Free returns on everything for 3 months.</p>
                            </div>
                        </div>
                    </div>
                    <!-- /.row -->

                </div>
                <!-- /.container -->

            </div>
            <!-- /#advantages -->

            <!-- *** ADVANTAGES END *** -->

            <!-- *** HOT PRODUCT SLIDESHOW ***
 _________________________________________________________ -->
            <div id="hot">

                <div class="box">
                    <div class="container">
                        <div class="col-md-12">
                            <h2>Top this week</h2>
                        </div>
                    </div>
                </div>

                <div class="container">
                    <div class="product-slider">
                        <div class="item">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="front">
                                            <a href="detail.html">
                                                <img src="<c:url value = '/resources/core/img/product1.jpg'/>" alt="" class="img-responsive">
                                            </a>
                                        </div>
                                        <div class="back">
                                            <a href="detail.html">
                                                <img src="<c:url value = '/resources/core/img/product1_2.jpg' />" alt="" class="img-responsive">
                                            </a>
                                        </div>
                                    </div>
                                </div>
                                <a href="detail.html" class="invisible">
                                    <img src="<c:url value = '/resources/core/img/product1.jpg' />" alt="" class="img-responsive">
                                </a>
                                <div class="text">
                                    <h3><a href="detail.html">Practising peace in time of war</a></h3>
                                    <p class="price">$143.00</p>
                                </div>
                                <!-- /.text -->
                            </div>
                            <!-- /.product -->
                        </div>

                        <div class="item">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="front">
                                            <a href="detail.html">
                                                <img src="<c:url value = '/resources/core/img/product2.jpg' />" alt="" class="img-responsive">
                                            </a>
                                        </div>
                                        <div class="back">
                                            <a href="detail.html">
                                                <img src="<c:url value = '/resources/core/img/product2_2.jpg' /> " alt="" class="img-responsive">
                                            </a>
                                        </div>
                                    </div>
                                </div>
                                <a href="detail.html" class="invisible">
                                    <img src="<c:url value = '/resources/core/img/product2.jpg'/>" alt="" class="img-responsive">
                                </a>
                                <div class="text">
                                    <h3><a href="detail.html">Tonglen</a></h3>
                                    <p class="price"><del>$280</del> $143.00</p>
                                </div>
                                <!-- /.text -->

                                <div class="ribbon sale">
                                    <div class="theribbon">SALE</div>
                                    <div class="ribbon-background"></div>
                                </div>
                                <!-- /.ribbon -->

                                <div class="ribbon new">
                                    <div class="theribbon">NEW</div>
                                    <div class="ribbon-background"></div>
                                </div>
                                <!-- /.ribbon -->

                                <div class="ribbon gift">
                                    <div class="theribbon">GIFT</div>
                                    <div class="ribbon-background"></div>
                                </div>
                                <!-- /.ribbon -->
                            </div>
                            <!-- /.product -->
                        </div>

                        <div class="item">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="front">
                                            <a href="detail.html">
                                                <img src="<c:url value = '/resources/core/img/product3.jpg' />" alt="" class="img-responsive">
                                            </a>
                                        </div>
                                        <div class="back">
                                            <a href="detail.html">
                                                <img src="<c:url value = '/resources/core/img/product3_2.jpg' /> " alt="" class="img-responsive">
                                            </a>
                                        </div>
                                    </div>
                                </div>
                                <a href="detail.html" class="invisible">
                                    <img src="<c:url value = '/resources/core/img/product3.jpg' /> " alt="" class="img-responsive">
                                </a>
                                <div class="text">
                                    <h3><a href="detail.html">Training the mind</a></h3>
                                    <p class="price">$143.00</p>
                                </div>
                                <!-- /.text -->
                            </div>
                            <!-- /.product -->
                        </div>

                        <div class="item">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="front">
                                            <a href="detail.html">
                                                <img src="<c:url value = '/resources/core/img/product4.jpg' /> " alt="" class="img-responsive">
                                            </a>
                                        </div>
                                        <div class="back">
                                            <a href="detail.html">
                                                <img src="<c:url value = '/resources/core/img/product4_2.jpg' /> " alt="" class="img-responsive">
                                            </a>
                                        </div>
                                    </div>
                                </div>
                                <a href="detail.html" class="invisible">
                                    <img src="<c:url value = '/resources/core/img/product4.jpg' /> " alt="" class="img-responsive">
                                </a>
                                <div class="text">
                                    <h3><a href="detail.html">The jazz piano</a></h3>
                                    <p class="price">$143.00</p>
                                </div>
                                <!-- /.text -->
                            </div>
                            <!-- /.product -->
                        </div>

                        <div class="item">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="front">
                                            <a href="detail.html">
                                                <img src="<c:url value = '/resources/core/img/product5.jpg' />" alt="" class="img-responsive">
                                            </a>
                                        </div>
                                        <div class="back">
                                            <a href="detail.html">
                                                <img src="<c:url value = '/resources/core/img/product5_2.jpg' /> " alt="" class="img-responsive">
                                            </a>
                                        </div>
                                    </div>
                                </div>
                                <a href="detail.html" class="invisible">
                                    <img src="<c:url value = '/resources/core/img/product5.jpg' /> " alt="" class="img-responsive">
                                </a>
                                <div class="text">
                                    <h3><a href="detail.html">Echoes of the souls</a></h3>
                                    <p class="price">$143.00</p>
                                </div>
                                <!-- /.text -->

                                <div class="ribbon new">
                                    <div class="theribbon">NEW</div>
                                    <div class="ribbon-background"></div>
                                </div>
                                <!-- /.ribbon -->
                            </div>
                            <!-- /.product -->
                        </div>

                        <div class="item">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="front">
                                            <a href="detail.html">
                                                <img src="<c:url value = '/resources/core/img/product1.jpg' /> " alt="" class="img-responsive">
                                            </a>
                                        </div>
                                        <div class="back">
                                            <a href="detail.html">
                                                <img src="<c:url value = 'img/product1_2.jpg' /> " alt="" class="img-responsive">
                                            </a>
                                        </div>
                                    </div>
                                </div>
                                <a href="detail.html" class="invisible">
                                    <img src="<c:url value = '/resources/core/img/product1.jpg' /> " alt="" class="img-responsive">
                                </a>
                                <div class="text">
                                    <h3><a href="detail.html">Fur coat</a></h3>
                                    <p class="price">$143.00</p>
                                </div>
                                <!-- /.text -->

                                <div class="ribbon gift">
                                    <div class="theribbon">GIFT</div>
                                    <div class="ribbon-background"></div>
                                </div>
                                <!-- /.ribbon -->

                            </div>
                            <!-- /.product -->
                        </div>
                        <!-- /.col-md-4 -->

                        <div class="item">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="front">
                                            <a href="detail.html">
                                                <img src="<c:url value = '/resources/core/img/product2.jpg' /> " alt="" class="img-responsive">
                                            </a>
                                        </div>
                                        <div class="back">
                                            <a href="detail.html">
                                                <img src="<c:url value = '/resources/core/img/product2_2.jpg'/> " alt="" class="img-responsive">
                                            </a>
                                        </div>
                                    </div>
                                </div>
                                <a href="detail.html" class="invisible">
                                    <img src="<c:url value = '/resources/core/img/product2.jpg' /> " alt="" class="img-responsive">
                                </a>
                                <div class="text">
                                    <h3><a href="detail.html">White Blouse Armani</a></h3>
                                    <p class="price"><del>$280</del> $143.00</p>
                                </div>
                                <!-- /.text -->

                                <div class="ribbon sale">
                                    <div class="theribbon">SALE</div>
                                    <div class="ribbon-background"></div>
                                </div>
                                <!-- /.ribbon -->

                                <div class="ribbon new">
                                    <div class="theribbon">NEW</div>
                                    <div class="ribbon-background"></div>
                                </div>
                                <!-- /.ribbon -->

                                <div class="ribbon gift">
                                    <div class="theribbon">GIFT</div>
                                    <div class="ribbon-background"></div>
                                </div>
                                <!-- /.ribbon -->
                            </div>
                            <!-- /.product -->
                        </div>

                        <div class="item">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="front">
                                            <a href="detail.html">
                                                <img src="<c:url value = '/resources/core/img/product3.jpg' /> " alt="" class="img-responsive">
                                            </a>
                                        </div>
                                        <div class="back">
                                            <a href="detail.html">
                                                <img src="<c:url value = '/resources/core/img/product3_2.jpg' /> " alt="" class="img-responsive">
                                            </a>
                                        </div>
                                    </div>
                                </div>
                                <a href="detail.html" class="invisible">
                                    <img src="<c:url value = '/resources/core/img/product3.jpg' /> " alt="" class="img-responsive">
                                </a>
                                <div class="text">
                                    <h3><a href="detail.html">Black Blouse Versace</a></h3>
                                    <p class="price">$143.00</p>
                                </div>
                                <!-- /.text -->
                            </div>
                            <!-- /.product -->
                        </div>

                    </div>
                    <!-- /.product-slider -->
                </div>
                <!-- /.container -->

            </div>
            <!-- /#hot -->

            <!-- *** HOT END *** -->

            <!-- *** GET INSPIRED ***
 _________________________________________________________ -->
            <div class="container" data-animate="fadeInUpBig">
                <div class="col-md-12">
                    <div class="box slideshow">
                        <h3>Get Inspired</h3>
                        <p class="lead">Get the inspiration from our bookstore</p>
                        <div id="get-inspired" class="owl-carousel owl-theme">
                            <div class="item">
                                <a href="#">
                                    <img src="<c:url value = '/resources/core/img/getinspired1.jpg' /> " alt="Get inspired" class="img-responsive">
                                </a>
                            </div>
                            <div class="item">
                                <a href="#">
                                    <img src="<c:url value = '/resources/core/img/getinspired2.jpg' /> " alt="Get inspired" class="img-responsive">
                                </a>
                            </div>
                            <div class="item">
                                <a href="#">
                                    <img src="<c:url value = '/resources/core/img/getinspired3.jpg' /> " alt="Get inspired" class="img-responsive">
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- *** GET INSPIRED END *** -->

            <!-- *** BLOG HOMEPAGE ***
 _________________________________________________________ -->
<!-- 
            <div class="box text-center" data-animate="fadeInUp">
                <div class="container">
                    <div class="col-md-12">
                        <h3 class="text-uppercase">From our blog</h3>

                        <p class="lead">What's new in the world of fashion? <a href="blog.html">Check our blog!</a>
                        </p>
                    </div>
                </div>
            </div>

            <div class="container">

                <div class="col-md-12" data-animate="fadeInUp">

                    <div id="blog-homepage" class="row">
                        <div class="col-sm-6">
                            <div class="post">
                                <h4><a href="post.html">Fashion now</a></h4>
                                <p class="author-category">By <a href="#">John Slim</a> in <a href="">Fashion and style</a>
                                </p>
                                <hr>
                                <p class="intro">Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean
                                    ultricies mi vitae est. Mauris placerat eleifend leo.</p>
                                <p class="read-more"><a href="post.html" class="btn btn-primary">Continue reading</a>
                                </p>
                            </div>
                        </div>

                        <div class="col-sm-6">
                            <div class="post">
                                <h4><a href="post.html">Who is who - example blog post</a></h4>
                                <p class="author-category">By <a href="#">John Slim</a> in <a href="">About Minimal</a>
                                </p>
                                <hr>
                                <p class="intro">Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean
                                    ultricies mi vitae est. Mauris placerat eleifend leo.</p>
                                <p class="read-more"><a href="post.html" class="btn btn-primary">Continue reading</a>
                                </p>
                            </div>

                        </div>

                    </div>
                    <!-- /#blog-homepage -->
                </div>
            </div>
            <!-- /.container -->

            <!-- *** BLOG HOMEPAGE END *** -->


        </div> -->
        <!-- /#content -->

        <!-- *** FOOTER ***
 _________________________________________________________ -->
        <div id="footer" data-animate="fadeInUp">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-sm-6">
                        <h4>Pages</h4>

                        <ul>
                            <li><a href="text.html">About us</a>
                            </li>
                            <li><a href="text.html">Terms and conditions</a>
                            </li>
                            <li><a href="faq.html">FAQ</a>
                            </li>
                            <li><a href="contact.html">Contact us</a>
                            </li>
                        </ul>

                        <hr>

                        <h4>User section</h4>

                        <ul>
                            <li><a href="#" data-toggle="modal" data-target="#login-modal">Login</a>
                            </li>
                            <li><a href="register.html">Register</a>
                            </li>
                        </ul>

                        <hr class="hidden-md hidden-lg hidden-sm">

                    </div>
                    <!-- /.col-md-3 -->

                    <div class="col-md-3 col-sm-6">

                        <h4>Top categories</h4>

                     

                        <ul>
                            <li><a href="category.html">Arts & Photography</a>
                            </li>
                            <li><a href="category.html">Humor & entertainment</a>
                            </li>
                            <li><a href="category.html">Romance</a>
                            </li>
                        </ul>


                        <hr class="hidden-md hidden-lg">

                    </div>
                    <!-- /.col-md-3 -->

                    <div class="col-md-3 col-sm-6">

                        <h4>Where to find us</h4>

                        <p><strong>Jebouquine Ltd.</strong>
                            <br>13/25 New Avenue
                            <br>New Heaven
                            <br>45Y 73J
                            <br>England
                            <br>
                            <strong>Great Britain</strong>
                        </p>

                        <a href="contact.html">Go to contact page</a>

                        <hr class="hidden-md hidden-lg">

                    </div>
                    <!-- /.col-md-3 -->



                    <div class="col-md-3 col-sm-6">

                        <h4>Get the news</h4>

                        <p class="text-muted">Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>

                        <form>
                            <div class="input-group">

                                <input type="text" class="form-control">

                                <span class="input-group-btn">

			    <button class="btn btn-default" type="button">Subscribe!</button>

			</span>

                            </div>
                            <!-- /input-group -->
                        </form>

                        <hr>

                        <h4>Stay in touch</h4>

                        <p class="social">
                            <a href="#" class="facebook external" data-animate-hover="shake"><i class="fa fa-facebook"></i></a>
                            <a href="#" class="twitter external" data-animate-hover="shake"><i class="fa fa-twitter"></i></a>
                            <a href="#" class="instagram external" data-animate-hover="shake"><i class="fa fa-instagram"></i></a>
                            <a href="#" class="gplus external" data-animate-hover="shake"><i class="fa fa-google-plus"></i></a>
                            <a href="#" class="email external" data-animate-hover="shake"><i class="fa fa-envelope"></i></a>
                        </p>


                    </div>
                    <!-- /.col-md-3 -->

                </div>
                <!-- /.row -->

            </div>
            <!-- /.container -->
        </div>
        <!-- /#footer -->

        <!-- *** FOOTER END *** -->




        <!-- *** COPYRIGHT ***
 _________________________________________________________ -->
        <div id="copyright">
            <div class="container">
                <div class="col-md-6">
                    <p class="pull-left">© 2015 Your name goes here.</p>

                </div>
                <div class="col-md-6">
                    <p class="pull-right">Template by <a href="http://bootstrapious.com/e-commerce-templates">Bootstrap Ecommerce Templates</a> with support from <a href="http://kakusei.cz">Designové předměty</a> 
                        <!-- Not removing these links is part of the licence conditions of the template. Thanks for understanding :) -->
                    </p>
                </div>
            </div>
        </div>
        <!-- *** COPYRIGHT END *** -->



    </div>
    <!-- /#all -->


    

    <!-- *** SCRIPTS TO INCLUDE ***
 _________________________________________________________ -->
 
  <spring:url value="/resources/core/js/jquery-1.11.0.min.js" var="jqueryminJs" />
   <spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapminJs" />
 <spring:url value="/resources/core/js/waypoints.min.js" var="waypointsJs" />
 <spring:url value="/resources/core/js/modernizr.js" var="modernizrJs" />
 <spring:url value="/resources/core/js/bootstrap-hover-dropdown.js" var="bootstrapJs" />
 <spring:url value="/resources/core/js/owl.carousel.min.js" var="carouselJs" />
 <spring:url value="/resources/core/js/front.js" var="frontJs" />
  <spring:url value="/resources/core/js/respond.min.js" var="respondJs" />
  <spring:url value="/resources/core/js/jquery.cookie.js" var="jqueryJs" />
 
<script src="${jqueryminJs}"></script>
<script src="${bootstrapminJs}"></script>
<script src="${waypointsJs}"></script>
<script src="${modernizrJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="${carouselJs}"></script>
<script src="${frontJs}"></script>
<script src="${respondJs}"></script>
<script src="${jqueryJs}"></script>



</body>

</html>
