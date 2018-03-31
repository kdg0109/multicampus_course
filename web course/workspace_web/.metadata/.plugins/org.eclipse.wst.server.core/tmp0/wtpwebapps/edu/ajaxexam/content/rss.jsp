<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<c:catch var="err">   
  <c:import var="weather" 
 url="http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=3171033000">
  </c:import>
  <!-- xml 파싱하기 -->
  <x:parse var="wrss" xml="${weather}"></x:parse>
  <x:out select="$wrss/rss/channel/title"></x:out><br/> 
  
  <table border="1">
     <tr>
         <td colspan="2" align="center">현재날씨</td>
     </tr>   
     <tr>
         <td>기준시간</td>
         <td>
               <x:out select="$wrss/rss/channel/pubDate"/> 
         </td>
     </tr>   
     <tr>
         <td>기온 </td>
         <td>
               <x:out select="$wrss/rss/channel/item/description/body/data/temp"/> 
        </td>
     </tr>   
     <tr>
         <td>습도 </td>
         <td> 
              <x:out select="$wrss/rss/channel/item/description/body/data/reh"/>% 
         </td>
     </tr>   
     <tr>
         <td>강수확률 </td>
         <td> 
              <x:out select="$wrss/rss/channel/item/description/body/data/pop"/> % 
         </td>
     </tr>
  </table>
</c:catch>
<c:if test="${err!=null}">
   ${err}
</c:if> 

