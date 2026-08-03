<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
    /* Reset */
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    }

    body {
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        background: linear-gradient(135deg, #0d1b2a, #1b263b, #415a77);
    }

    .login-container {
        background: rgba(255, 255, 255, 0.05);
        backdrop-filter: blur(15px);
        padding: 45px 40px;
        border-radius: 20px;
        box-shadow: 0 15px 40px rgba(0,0,0,0.4);
        width: 350px;
        text-align: center;
        border: 1px solid rgba(255,255,255,0.2);
        transition: transform 0.3s ease, box-shadow 0.3s ease;
    }

    .login-container:hover {
        transform: translateY(-5px);
        box-shadow: 0 20px 50px rgba(0,0,0,0.6);
    }

    .login-container h2 {
        margin-bottom: 30px;
        font-size: 28px;
        color: #f0e68c; /* subtle golden text */
        letter-spacing: 1px;
    }

    .login-container input[type="text"],
    .login-container input[type="password"] {
        width: 100%;
        padding: 14px 15px;
        margin: 12px 0;
        border: none;
        border-radius: 10px;
        font-size: 16px;
        outline: none;
        background: rgba(255, 255, 255, 0.15);
        color: #fff;
        transition: background 0.3s ease, box-shadow 0.3s ease;
    }

    .login-container input[type="text"]::placeholder,
    .login-container input[type="password"]::placeholder {
        color: #ddd;
    }

    .login-container input[type="text"]:focus,
    .login-container input[type="password"]:focus {
        background: rgba(255, 255, 255, 0.25);
        box-shadow: 0 0 10px rgba(255, 255, 255, 0.5);
    }

    .login-container input[type="submit"] {
        width: 100%;
        padding: 14px;
        margin-top: 20px;
        border: none;
        border-radius: 10px;
        background: linear-gradient(135deg, #f0e68c, #ffd700);
        color: #0d1b2a;
        font-weight: bold;
        font-size: 16px;
        cursor: pointer;
        transition: transform 0.2s ease, box-shadow 0.3s ease;
    }

    .login-container input[type="submit"]:hover {
        transform: scale(1.05);
        box-shadow: 0 5px 20px rgba(255, 215, 0, 0.5);
    }

    .login-container p {
        margin-top: 15px;
        font-size: 14px;
        color: #ddd;
    }

    .login-container a {
        color: #f0e68c;
        text-decoration: none;
        font-weight: bold;
    }

    .login-container a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>
    <div class="login-container">
        <h2>Welcome Back</h2>
        <form action="verifyLogin" method="post">
            <input type="text" name="email" placeholder="Enter your Email" required />
            <input type="password" name="password" placeholder="Enter your Password" required />
            <input type="submit" value="Login"/>
        </form>
        <p>Don’t have an account? <a href="register.jsp">Register here</a></p>
    </div>
    <%
    if(request.getAttribute("error")!=null){
    out.println(request.getAttribute("error"));
    }
    %>
</body>
</html>
