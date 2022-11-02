

module com.cloud.service.impl {
    provides com.service.api.ServiceImpl with com.cloud.service.impl.Service;
    requires com.jmp.dto;
    requires com.service.api;
    exports com.cloud.service.impl;


}