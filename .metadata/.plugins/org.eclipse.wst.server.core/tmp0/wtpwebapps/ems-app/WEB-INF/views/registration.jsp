<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
<style>
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

    .register-container {
        background-color:rgba(255, 255, 255, 0.05); */
        color: #1e3c72;
        width: 1000px; /* wide container */
        padding: 40px 30px;
        border-radius: 10px;
        box-shadow: 0 8px 25px rgba(0,0,0,0.3);
    }

    .register-container h2 {
        text-align: center;
        margin-bottom: 30px;
        font-size: 32px;
        color: #f0e68c;
    }

    form {
        display: flex;
        flex-wrap: wrap; /* enable two-column layout */
        gap: 20px;
    }

    .form-group {
        flex: 1 1 45%; /* two columns with some gap */
        display: flex;
        flex-direction: column;
    }

    input, select {
       /* padding: 12px 15px;
        border-radius: 5px;
        border: 1px solid #ccc;
        font-size: 16px;
        outline: none;*/
        
         width: 100%;
        padding: 12px 15px;
        margin: 12px 0;
        border: none;
        border-radius: 5px;
        font-size: 16px;
        outline: none;
        background: rgba(255, 255, 255, 0.15);
        color: #fff;
        transition: background 0.3s ease, box-shadow 0.3s ease;
    }

    input:focus,
    select:focus {
         border-color: #1e3c72;
    box-shadow: 0 0 8px rgba(30,60,114,0.4);
    color: #000; /* text color when focused */
    background-color: #f9f9f9;
    }

    input[type="submit"] {
    
        
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

    input[type="submit"]:hover {
        transform: scale(1.03);
        box-shadow: 0 5px 15px rgba(30,60,114,0.5);
    }
</style>
</head>
<body>
    <div class="register-container">
        <h2>Student Registration</h2>
        <form action="registerStudent" method="post">
            <div class="form-group">
                <input type="text" name="fullname" placeholder="Full Name" required/>
            </div>
            <div class="form-group">
                <input type="date" name="dob" required/>
            </div>
            <div class="form-group">
                <select name="gender" required>
                    <option value="">Select Gender</option>
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                    <option value="Other">Other</option>
                </select>
            </div>
            <div class="form-group">
                <input type="email" name="email" placeholder="Email" required/>
            </div>
            <div class="form-group">
                <input type="text" name="phone" placeholder="Phone Number" required/>
            </div>
            <div class="form-group">
                <input type="text" name="course" placeholder="Course Name" required/>
            </div>
            <div class="form-group">
                <input type="text" name="year" placeholder="Year/Semester" required/>
            </div>
            <div class="form-group">
                <input type="text" name="studentId" placeholder="Student ID" required/>
            </div>
            <div class="form-group">
                <input type="text" name="username" placeholder="Username" required/>
            </div>
            <div class="form-group">
                <input type="password" name="password" placeholder="Password" required/>
            </div>
            <input type="submit" value="Register"/>
        </form>
    </div>
</body>
</html>
