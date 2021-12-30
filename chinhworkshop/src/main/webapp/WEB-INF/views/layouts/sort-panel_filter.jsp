<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file = "/WEB-INF/views/layouts/tablib.jsp" %>

	 <div class="category-page-wrapper">
        <div class="col-md-6 list-grid-wrapper">
          <div class="btn-group btn-list-grid">
            <button type="button" id="list-view" class="btn btn-default list" data-toggle="tooltip" title="List"><i class="fa fa-th-list"></i></button>
            <button type="button" id="grid-view" class="btn btn-default grid" data-toggle="tooltip" title="Grid"><i class="fa fa-th"></i></button>
          </div>
          <a href="#" id="compare-total">Product Compare (0)</a> </div>
        <div class="col-md-1 text-right page-wrapper">
          <label class="control-label" for="input-limit">Show :</label>
          <div class="limit">
            <select id="input-limit" class="form-control" onchange="location = this.value;">
              <option value="filter-page1&show8&sort${sort}${urlFilter}"<c:if test="${ itemPerPage==8 }">selected="selected"</c:if>>8</option>
              <option value="filter-page1&show20&sort${sort}${urlFilter}" <c:if test="${ itemPerPage==20 }">selected="selected"</c:if>> 20</option>
            </select>
          </div>
        </div>
        <div class="col-md-2 text-right sort-wrapper">
          <label class="control-label" for="input-sort">Sort By :</label>
          <div class="sort-inner">
            <select id="input-sort" class="form-control" onchange="location = this.value;">
              <option value="filter-page1&show${itemPerPage}&sort1${urlFilter}"<c:if test="${ sort==1 }">selected="selected"</c:if>>Default</option>
              <option value="filter-page1&show${itemPerPage}&sort2${urlFilter}"<c:if test="${ sort==2 }">selected="selected"</c:if>>Price (Low&gt;High)</option>
              <option value="filter-page1&show${itemPerPage}&sort3${urlFilter}"<c:if test="${ sort==3 }">selected="selected"</c:if>>Price (High&gt;Low)</option>
            </select>
          </div>
        </div>
      </div>