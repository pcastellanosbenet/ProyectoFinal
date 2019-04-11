
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html  >
<head>
  <!-- Site made with Mobirise Website Builder v4.9.7, https://mobirise.com -->
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="generator" content="Mobirise v4.9.7, mobirise.com">
  <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1">  
  <meta name="description" content="Web Generator Description">
  
  <title>formularios</title>
  <link rel="stylesheet" href="resources/assets/tether/tether.min.css">
  <link rel="stylesheet" href="resources/assets/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="resources/assets/bootstrap/css/bootstrap-grid.min.css">
  <link rel="stylesheet" href="resources/assets/bootstrap/css/bootstrap-reboot.min.css">
  <link rel="stylesheet" href="resources/assets/datatables/data-tables.bootstrap4.min.css">
  <link rel="stylesheet" href="resources/assets/theme/css/style.css">
  <link rel="stylesheet" href="resources/assets/mobirise/css/mbr-additional.css" type="text/css">  
  
</head>
<body>
  <section class="mbr-section form1 cid-rnad81Scah mbr-parallax-background" id="form1-f">
 <div class="mbr-overlay" style="opacity: 0.4; background-color: rgb(204, 204, 204);">
    </div>
    <div class="container">
       <div class="row justify-content-center">        
            <div class="title col-12 col-lg-8">
                <h2 class="mbr-section-title align-center pb-3 mbr-fonts-style display-2">
                    FORMULARIO
                </h2>                            
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row justify-content-center">
            <div class="media-container-column col-lg-8" data-form-type="formoid">
                <!---Formbuilder Form--->
                <form action="#" method="POST" class="mbr-form form-with-styler" 
                data-form-title="Mobirise Form"><input type="hidden" name="email" data-form-email="true" 
                value="">                    
                    <div class="dragArea row row-sm-offset">
                        <div class="col-md-4  form-group" data-for="name">
                            <label for="name-form1-f" class="form-control-label mbr-fonts-style display-7">NAME</label>
                            <input type="text" name="name" data-form-field="Name" 
                            required="required" class="form-control display-7" id="name-form1-f">
                        </div>
                        <div class="col-md-4  form-group" data-for="email">
                            <label for="email-form1-f" class="form-control-label mbr-fonts-style display-7">EMAIL</label>
                            <input type="email" name="email" data-form-field="Email" 
                            required="required" class="form-control display-7" id="email-form1-f">
                        </div>
                        <div data-for="phone" class="col-md-4  form-group">
                            <label for="phone-form1-f" class="form-control-label mbr-fonts-style display-7">PHONE</label>
                            <input type="tel" name="phone" data-form-field="Phone" 
                            class="form-control display-7" id="phone-form1-f">
                        </div>  
                        
                    </div>
                    <div class="dragArea row row-sm-offset">
                        <div class="col-md-4  form-group" data-for="name">
                            <label for="name-form1-f" class="form-control-label mbr-fonts-style display-7">LAST NAME</label>
                            <input type="text" name="name" data-form-field="Name" 
                            required="required" class="form-control display-7" id="name-form1-f">
                        </div>
                        <div class="col-md-4  form-group" data-for="email">
                            <label for="email-form1-f" class="form-control-label mbr-fonts-style display-7">DATE IN</label>
                            <input type="date" name="datein" data-form-field="Email" 
                            required="required" class="form-control display-7" id="email-form1-f">
                        </div>
                        <div data-for="phone" class="col-md-4  form-group">
                            <label for="phone-form1-f" class="form-control-label mbr-fonts-style display-7">DATE OUT</label>
                            <input type="date" name="dateout" data-form-field="Phone" 
                            class="form-control display-7" id="phone-form1-f">
                        </div>                        
                        <div class="col-md-12 input-group-btn align-center">
                            <button type="submit" class="btn btn-primary btn-form display-4">SEND FORM</button>
                        </div>
                    </div>
                </form><!---Formbuilder Form--->
            </div>
        </div>
    </div>
</section>
<section class="section-table cid-rnaeh8STy2 mbr-parallax-background" id="table1-h">  
  <div class="mbr-overlay" style="opacity: 0.4; background-color: rgb(255, 255, 255);">
  </div>
  <div class="container container-table">
      <h2 class="mbr-section-title mbr-fonts-style align-center pb-3 display-2">
          Clientes</h2>
      
      <div class="table-wrapper">
        <div class="container">
          <div class="row search">
            <div class="col-md-6"></div>
            <div class="col-md-6">
                <div class="dataTables_filter">
                  <label class="searchInfo mbr-fonts-style display-7">Search:</label>
                  <input class="form-control input-sm">
                </div>
            </div>
          </div>
        </div>

        <div class="container scroll">
          <table class="table isSearch" cellspacing="0">
            <thead>
              <tr class="table-heads ">         
              <th class="head-item mbr-fonts-style display-7"> NOMBRE</th>
                      <th class="head-item mbr-fonts-style display-7">LAST NAME</th>
                      <th class="head-item mbr-fonts-style display-7">DATE IN</th>
                      <th class="head-item mbr-fonts-style display-7">DATE OUT</th>
                      <th class="head-item mbr-fonts-style display-7">TELEPHONE</th>
                      <th class="head-item mbr-fonts-style display-7">EMAIL</th>
                      <th class="head-item mbr-fonts-style display-7">DNI</th>
                      <th class="head-item mbr-fonts-style display-7">HOTEL</th>
                      <th class="head-item mbr-fonts-style display-7">EDIT</th>
                      <th class="head-item mbr-fonts-style display-7">DELETE</th>
                </tr>
            </thead>
            <tbody>            
            <tr>              
              <td class="body-item mbr-fonts-style display-7">Jeanna</td>
              <td class="body-item mbr-fonts-style display-7">Schmal</td>
              <td class="body-item mbr-fonts-style display-7">2016-10-17</td>
              <td class="body-item mbr-fonts-style display-7">2016-10-17</td>
              <td class="body-item mbr-fonts-style display-7">653 4783</td>
              <td class="body-item mbr-fonts-style display-7">jjjjj@gggg.com</td>
              <td class="body-item mbr-fonts-style display-7">y6723987f</td>
              <td class="body-item mbr-fonts-style display-7">Hotel 1</td>
              <td class="body-item mbr-fonts-style display-7">
              	<a href="/proyectoMod5/edit">Edit</a>
              </td>
              <td class="body-item mbr-fonts-style display-7">
              	<a href="/proyectoMod5/delete">DELETE</a>
              	</td>
              </tr>
              <tr>              
              <td class="body-item mbr-fonts-style display-7">Pavel </td>
              <td class="body-item mbr-fonts-style display-7">Castellanos</td>
              <td class="body-item mbr-fonts-style display-7">2016-10-17</td>
              <td class="body-item mbr-fonts-style display-7">2016-10-17</td>
              <td class="body-item mbr-fonts-style display-7">672 4783</td>
              <td class="body-item mbr-fonts-style display-7">ppppp@ggg.com</td>
              <td class="body-item mbr-fonts-style display-7">x6723987f</td>
              <td class="body-item mbr-fonts-style display-7">Hotel 2</td>
              <td class="body-item mbr-fonts-style display-7">
              <a href="/proyectoMod5/edit">Edit</a>
              </td>
              <td class="body-item mbr-fonts-style display-7">
              <a href="/proyectoMod5/delete">DELETE</a>
              </td>
              </tr>
              </tr>
              <tr>              
              <td class="body-item mbr-fonts-style display-7">Marcos</td>
              <td class="body-item mbr-fonts-style display-7">Manuel</td>
              <td class="body-item mbr-fonts-style display-7">2016-10-17</td>
              <td class="body-item mbr-fonts-style display-7">2016-10-17</td>
              <td class="body-item mbr-fonts-style display-7">695 4783</td>
              <td class="body-item mbr-fonts-style display-7">mmmm@ggg.com</td>
              <td class="body-item mbr-fonts-style display-7">z6723987f</td>
              <td class="body-item mbr-fonts-style display-7">Hotel 3</td>
              <td class="body-item mbr-fonts-style display-7">
               <a href="/proyectoMod5/edit">Edit</a>
               </td>
              <td class="body-item mbr-fonts-style display-7">
              <a href="/proyectoMod5/delete">DELETE</a>
              </td>
              </tr>
              </tbody>
          </table>
        </div>
        <div class="container table-info-container">
          <div class="row info">
            <div class="col-md-6">
              <div class="dataTables_info mbr-fonts-style display-7">
                <span class="infoBefore">Showing</span>
                <span class="inactive infoRows"></span>
                <span class="infoAfter">entries</span>
                <span class="infoFilteredBefore">(filtered from</span>
                <span class="inactive infoRows"></span>
                <span class="infoFilteredAfter"> total entries)</span>
              </div>
            </div>
            <div class="col-md-6"></div>
          </div>
        </div>
      </div>
    </div>
</section>

<script src="resources/project.js"></script>

  <script src="resources/assets/web/assets/jquery/jquery.min.js"></script>
  <script src="resources/assets/popper/popper.min.js"></script>
  <script src="resources/assets/tether/tether.min.js"></script>
  <script src="resources/assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="resources/assets/smoothscroll/smooth-scroll.js"></script>
  <script src="resources/assets/parallax/jarallax.min.js"></script>
  <script src="resources/assets/datatables/jquery.data-tables.min.js"></script>
  <script src="resources/assets/datatables/data-tables.bootstrap4.min.js"></script>
  <script src="resources/assets/theme/js/script.js"></script>
  <script src="resources/assets/formoid/formoid.min.js"></script>
  
  
</body>
</html>