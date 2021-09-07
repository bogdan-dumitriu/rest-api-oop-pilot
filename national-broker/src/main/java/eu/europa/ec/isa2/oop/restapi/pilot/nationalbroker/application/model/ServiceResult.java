package eu.europa.ec.isa2.oop.restapi.pilot.nationalbroker.application.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Joze Rihtarsic
 * @since 1.0
 */
public class  ServiceResult<T> implements Serializable {

    private static final long serialVersionUID = -4971552086560325302L;

    private Map<String, Object> filter; //NOSONAR
    private List<T> serviceEntities; //NOSONAR


    private Long count;
    private Integer page;
    private Integer pageSize;

    public Map<String, Object> getFilter() {
        return filter;
    }

    public void setFilter(Map<String, Object> filter) {
        this.filter = filter;
    }

    public List<T> getServiceEntities() {
        if (serviceEntities == null) {
            serviceEntities = new ArrayList<>();
        }
        return serviceEntities;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
