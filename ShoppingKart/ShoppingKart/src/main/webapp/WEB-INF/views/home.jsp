<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
<link rel="text/stylesheet">
body{
background color:#696969;
}
ul {
    list-style-type: none;
    margin: 0;
   
    overflow: hidden;
    background-color: none;
}
li {
    float: left;
}
li a {
    display: block;
    color: white;
    text-align: Left;
    /*padding: 10px 10px;*/
    text-decoration: none;
}
li a:hover:not(.active) {
    background-color:teal;
}
.active {
    background-color: #4CAF50;
}
li a, .dropbtn {
    display: inline-block;
    color:indigo;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}
li a:hover, .dropdown:hover .dropbtn {
    background-color:blue;
}
li.dropdown {
    display: inline-block;
}
.dropdown-content {
    display: none;
    position: absolute;
    background-color:gray;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}
.dropdown-content a {
    color: orange;
   padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}
.dropdown-content a:hover {background-color: #f1f1f1}
.dropdown:hover .dropdown-content {
    display: block;
}
div.container
{
        
font-family: Raleway;
    margin: 0 auto;
padding: 1em 3em;
    text-align:right;
}
div.container a
{
    color: #FFF;
    text-decoration: none;
    font: 20px Raleway;
    margin: 0px 10px;
    padding: 10px 10px;
    position: relative;
    z-index: 0;
    cursor: pointer;
}
.indigo
{
    background: #3f51b5;
}
/* Top and Bottom borders come in */
div.topBotomBordersIn a:before, div.topBotomBordersIn a:after
{
    position: absolute;
    left: 0px;
    width: 100%;
    height: 1px;
    background: #FFF;
    content: "";
    opacity: 0;
    transition: all 0.3s;
}
div.topBotomBordersIn a:before
{
    top: 0px;
    transform: translateY(-10px);
}
div.topBotomBordersIn a:after
{
    bottom: 0px;
    transform: translateY(10px);
}
div.topBotomBordersIn a:hover:before, div.topBotomBordersIn a:hover:after
{
    opacity: 1;
    transform: translateY(0px);
}
/* Top border go down and Left border appears */
div.topLeftBorders a:before
{
    position: absolute;
    top: 0px;
    left: 0px;
    width: 2px;
    height: 0px;
    background: #FFF;
    content: "";
    opacity: 1;
    transition: all 0.3s;
}
div.topLeftBorders a:after
{
    position: absolute;
    top: 0px;
    left: 0px;
    width: 100%;
    height: 2px;
    background: #FFF;
    content: "";
    opacity: 1;
    transition: all 0.3s;
}
div.topLeftBorders a:hover:before
{
    height: 100%;
}
div.topLeftBorders a:hover:after
{
    opacity: 0;
    top: 100%;
}
.add-on .input-group-btn > .btn {
  border-left-width:0;left:-1px;
  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
  box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
}
.slider {
	width:750px;
	margin: 2em auto;
	margin-top: -1px;
}
.slider-wrapper {
	width: 100%;
	height: 200px;
	position:relative;
	padding-left: 40px;
    padding-right:40px;
}
.slide {
	float: right;
	position: absolute;
	width: 100%;
	height: 100%;
	opacity: 0;
	transition: opacity 3s linear;
}
.slider-wrapper > .slide:first-child {
	opacity: 1;
}
#logo {
  height: 50px;
  vertical-align: middle;
}
table1, th1, td1 {
    border: 1px solid black;
   
  
}
table1 {
    border-spacing: 15px;
    }
footer {
  position: fixed;
  bottom: 0;
  left: 0;
  height: 70px;
  background-color: white;
  width: 100%;
}
</style>
<script>
(function() {
	
	function Slideshow( element ) {
		this.el = document.querySelector( element );
		this.init();
	}
	
	Slideshow.prototype = {
		init: function() {
			this.wrapper = this.el.querySelector( ".slider-wrapper" );
			this.slides = this.el.querySelectorAll( ".slide" );
			this.previous = this.el.querySelector( ".slider-previous" );
			this.next = this.el.querySelector( ".slider-next" );
			this.index = 0;
			this.total = this.slides.length;
			this.timer = null;
			
			this.action();
			this.stopStart();	
		},
		_slideTo: function( slide ) {
			var currentSlide = this.slides[slide];
			currentSlide.style.opacity = 1;
			
			for( var i = 0; i < this.slides.length; i++ ) {
				var slide = this.slides[i];
				if( slide !== currentSlide ) {
					slide.style.opacity = 0;
				}
			}
		},
		action: function() {
			var self = this;
			self.timer = setInterval(function() {
				self.index++;
				if( self.index == self.slides.length ) {
					self.index = 0;
				}
				self._slideTo( self.index );
				
			},3000);
		},
		stopStart: function() {
			var self = this;
			self.el.addEventListener( "mouseover", function() {
				clearInterval( self.timer );
				self.timer = null;
				
			}, false);
			self.el.addEventListener( "mouseout", function() {
				self.action();
				
			}, false);
		}
		
		
	};
	
	document.addEventListener( "DOMContentLoaded", function() {
		
		var slider = new Slideshow( "#main-slider" );
		
	});
	
	
})();
</script>
</head>
<body>
<div class="container indigo topLeftBorders" >
<ul>
<li>
<div class="container">
<div>

   <li><a href="home">Home</a></li>
   <li><a href="trends">TRENDS</a></li>
<li><a href="t2cu" >T2CYOU</a></li>
<li><a href="about">ABOUTUS</a></li>    
<li><a href="brands">BRANDS</a></li>
<li><a herf="collections">COLLECTION</a></li>
  <li class="dropdown"><div class="dropdown">
  <a href="javascript:void(0)" class="dropbtn">admin</button>
  <div class="dropdown-content">
    <a href="newSupplier" >Supplier</a>
  <a href="newCategry" >Category</a>
 
  <a href="newProduct" >Product</a>
 
  <a href="newCart" >Cart</a>
  
 </div>
 </li>  
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">MY Account</a>
    <div class="dropdown-content">
      <a href="signin">user</a>
      <a href="newUser">Signup</a></li>
     </div>

</div>

</li>
</ul>
</div>



<div class="slider" id="main-slider"><!-- outermost container element -->
	<div class="slider-wrapper"><!-- innermost wrapper element -->
		<img src="resources/images/sd.jpg" alt="First" class="slide" />
		<img src="resources/images/sd3.jpg" alt="second" class="slide" />
		<img src="resources/images/sd4.jpg" alt="Third" class="slide" />

	</div>
</div>	


<fieldset>
  <legend>RECOMMENTATION</legend>
  
<table1>
<tr>
<th1><img src="file:///C:/Users/acer/Desktop/html/salwar11.jpg"alt=salwarRS500 height="200" width="200"></th1>
<th1><img src="file:///C:/Users/acer/Desktop/html/salwar9.jpg "height="200" width="200"></th1>
<th1><img src="file:///C:/Users/acer/Desktop/html/salwar9.jpg "height="200" width="200"></th1>
<th1><img src=" file:///C:/Users/acer/Desktop/html/salwar10.jpg"height="200" width="200"></th1>
<th1><img src=" file:///C:/Users/acer/Desktop/html/saree.jpg"height="200" width="200"></th1>
<th1><img src="file:///C:/Users/acer/Desktop/html/saree8.jpg "height="200" width="200"></th1>
<th1><img src="file:///C:/Users/acer/Desktop/html/lehanga5.jpg "height="200" width="200"></th1>

</tr>
</table1>
</fieldset>
<fieldset>
<legend>OFFERS</legend>
  <table1>
<tr>
<th1><img src="file:///C:/Users/acer/Desktop/html/salwar14.jpg" alt=salwarRS500 height="200" width="200"></th1>
<th1><img src="file:///C:/Users/acer/Desktop/html/salwar8.jpg "height="200" width="200"></th1>
<th1><img src=" file:///C:/Users/acer/Desktop/html/salwar12.jpg"height="200" width="200"></th1>
<th1><img src=" file:///C:/Users/acer/Desktop/html/salwar15.jpg"height="200" width="200"></th1>
<th1><img src="file:///C:/Users/acer/Desktop/html/saree5.jpg "height="200" width="200"></th1>
<th1><img src="file:///C:/Users/acer/Desktop/html/lehanga.jpg "height="200" width="200"></th1>
</tr>
</table1>
</marquee>
</fieldset>

<footer>

<table style="border-spacing: 10px; background-color:#3f51b5;">

  <tr>
  <th> Contactus</th>
<td>Email us at <br> <u> contacts@tap2city.com</td><td>track our orders</td>
    <td>Delivery returns</td>
    <td>Seller Handbook</td>
<td>track our orders</td>
  
<th>Our Company</th>
<td>Office Address :<br>
A-64 , FIEE Complex , Okhla Phase - II <br>New Delhi - 110020</td>
    <td>career</td>
    <td>terms and pollicies</td>

  <th>Policies</th>
  <th>For Seller</th> 
 
</tr>
  </table>
</footer>
</body>
</html>