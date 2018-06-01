<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib prefix="function" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="list" value="${sessionScope.semesterlist }"></c:set>
<c:set var="len" value="${function:length(list) }"></c:set>
[<c:forEach items="${sessionScope.semesterlist }" var="i" varStatus="j">
		{"semId":"${i.semId }","semName":"${i.semName }"}<c:if test="${len ne j.count }">,</c:if>
	</c:forEach>]