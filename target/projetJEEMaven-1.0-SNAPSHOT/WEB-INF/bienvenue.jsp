<%-- 
    Document   : aurevoir
    Created on : 7 déc. 2018, 10:54:15
    Author     : Clément
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <body>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-9">
                    <h1 class="page-header">Liste des Employes</h1>
                </div>
                <!-- /.col-lg-12 -->
                <jsp:include page="disconnectForm.jsp"/>
            </div>
            <!-- /.row -->
            <div class="row">
                
                <c:choose>
                    <c:when test="${requestScope.typeMessage ==0}">
                        <div class="alert alert-danger" role="alert">
                            <p style="color:firebrick;"> La suppression a échoué !</p>
                        </div>
                    </c:when>
                    
                    <c:when test="${requestScope.typeMessage ==1}">
                        <div class="alert alert-primary" role="alert">
                            <p style="color:steelblue;"> La suppression a réussi !</p>
                        </div>
                    </c:when>
                    
                    <c:otherwise>
                         
                    </c:otherwise>
                </c:choose>
                
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">

                        </div>
                        <!-- /.panel-heading -->
                        <form method="POST" action="./projetJEEMaven">  
                        <c:choose>
                            <c:when test="${requestScope.employes.size() !=0}">


                                <div class="panel-body">
                                    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                        <thead>
                                            <tr>
                                                <th><b>Detail</b></th>
                                                <th><b>Name</b></th>
                                                <th><b>First name</b></th>
                                                <th><b>Home phone</b></th>
                                                <th><b>Mobile phone</b></th>
                                                <th><b>Office phone</b></th>
                                                <th><b>Adress</b></th>
                                                <th><b>Postal code</b></th>
                                                <th><b>City</b></th>
                                                <th><b>Email</b></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                             
                                                <c:forEach items="${requestScope.employes}" var="employe" >
                                                    <tr> 
                                                    <td>  <INPUT TYPE="radio" NAME='radiosSelected' VALUE="${ employe.id }" CHECKED ></td>
                                                    <td><c:out value="${ employe.nom }" /> </td>
                                                    <td><c:out value="${ employe.prenom }" /> </td>
                                                    <td><c:out value="${ employe.teldom }" /> </td>
                                                    <td><c:out value="${ employe.telport }" /> </td>
                                                    <td><c:out value="${ employe.telpro }" /> </td>
                                                    <td><c:out value="${ employe.adresse }" /> </td>
                                                    <td><c:out value="${ employe.codePostal }" /> </td>
                                                    <td><c:out value="${ employe.ville }" /> </td>
                                                    <td><c:out value="${ employe.email }" /> </td>
                                                    </tr>
                                                </c:forEach> 



                                        </tbody>
                                    </table>
                                    <input type='submit' name="action" value="Supprimer" class='btn btn-primary'/>
                                    <input type='submit' name="action" value="Details" class='btn btn-primary'/>
                                    </c:when>
                                        <c:otherwise>
                                            <div class="alert alert-danger" role="alert">
                                                <p> Nous devons recruter ! </p>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>
                                    <input type='submit' name="action" value="Ajouter" class='btn btn-light'/> 
                                </form>
                                <!-- /.table-responsive -->
                            </div>
                            <!-- /.panel-body -->         
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
        </div>
        <!-- /#page-wrapper -->
    </body>
</html>
