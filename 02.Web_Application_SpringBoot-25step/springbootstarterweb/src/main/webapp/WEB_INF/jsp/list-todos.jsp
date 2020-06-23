<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
    <title>First Web Application</title>
</head>

<body>

<h1> your table</h1>
<table>
    <caption>your todos are</caption>
    <thead>
    <tr>
        <th>Desc</th>
        <th>Date</th>
        <th>Done</th>
    </tr>
    </thead>
    <tbody>
    JSTL for Loop
    <c:forEach items ="${todos}" var="item">
        <tr>
            <td>${todo.desc}</td>
            <td>${todo.targetdDate}</td>
            <td>${todo.done}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>
Here are the list of ${name}'s todos:
${todos}.
<BR/>
<a href="/add-todo">Add a Todo</a>
</body>

</html>