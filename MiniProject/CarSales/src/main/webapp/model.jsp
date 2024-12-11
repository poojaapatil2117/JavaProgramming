<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="com.jspservlet.carsales.db.DB" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Model - Car Sales</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        body {
            background: url('<%= request.getContextPath() %>/images/bg.jpg') no-repeat center center fixed;
            background-size: cover;
            font-family: 'Arial', sans-serif;
        

        .container {
            margin-top: 30px;
        }

        .card {
            border: none;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            overflow: hidden;
        }

        .card-header {
            background-color: #007bff;
            color: #fff;
            padding: 15px;
            font-size: 1.25rem;
        }

        .card-body {
            padding: 20px;
        }

        .btn-primary {
            background-color: #007bff;
            border: none;
            font-weight: bold;
        }

        .btn-primary:hover {
            background-color: #0056b3;
        }
        }
    </style>
</head>
<body>
    <div class="container">
        <%@ include file="WEB-INF/jspf/header.jsp" %>

        <div class="row">
            <div class="col-md-3">
                <%@ include file="WEB-INF/jspf/slidebar.jsp" %>
            </div>

            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        Add Model
                    </div>
                    <div class="card-body">
                        <form action="ModelServlet" method="post">
                        
                            <div class="mb-3">
                                <label for="brand" class="form-label">Select Brand</label>
                                <select name="id" class="form-control" id="brand" required>
                                    <option value="" disabled selected>Choose a brand</option>
                                    <% 
                                        try (Connection conn = DB.getCon();
                                             PreparedStatement stmt = conn.prepareStatement("SELECT id, name FROM brand");
                                             ResultSet rs = stmt.executeQuery()) {
                                            while (rs.next()) {
                                                out.println("<option value='" + rs.getInt("id") + "'>" + rs.getString("name") + "</option>");
                                            }
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    %>
                                </select>
                            </div>

                          
                            <div class="mb-3">
                                <label for="modelName" class="form-label">Model Name</label>
                                <input type="text" class="form-control" name="name" id="modelName" placeholder="Enter model name" required>
                            </div>

                        
                            <button type="submit" class="btn btn-primary mt-3">Save</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
</body>
</html>