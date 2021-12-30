<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file = "/WEB-INF/views/layouts/tablib.jsp" %>

	<div class="category-page-wrapper">
        <div class="result-inner">Showing 1 to ${ itemPerPage } of ${allfilter_products.size() } (${paginates.size()} Pages)</div>
        <div class="pagination-inner">
          <ul class="pagination">
          	<c:forEach items="${paginates}" var="item" varStatus="loop">
            <c:if test="${ (loop.index + 1) == pageId }">
            <li class="active"><span>${ loop.index+1 }</span></li>
            </c:if>
            <c:if test="${ (loop.index + 1) != pageId }">
            <li><a href="filter-page${(loop.index + 1)}&show${itemPerPage}&sort${sort}${urlFilter}">${ loop.index+1 }</a></li>
            </c:if>
            </c:forEach>
            <c:if test="${pageId != paginates.size() }">
            <li><a href="filter-page${(pageId + 1)}&show${itemPerPage}&sort${sort}${urlFilter}">&gt;</a></li>
            <li><a href="filter-page${paginates.size()}&show${itemPerPage}&sort${sort}${urlFilter}">&gt;|</a></li>
            </c:if>
            <c:if test="${pageId == paginates.size() }">
            <li><a href="filter-page${(pageId - 1)}&show${itemPerPage}&sort${sort}${urlFilter}">&lt;</a></li>
            <li><a href="filter-page1&show${itemPerPage}&sort${sort}${urlFilter}">|&lt;</a></li>
            </c:if>
          </ul>
        </div>
      </div>