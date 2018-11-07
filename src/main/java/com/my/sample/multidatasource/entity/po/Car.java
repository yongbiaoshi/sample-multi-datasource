package com.my.sample.multidatasource.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 车辆表
 * </p>
 *
 * @author shiyongbiao
 * @since 2018-11-07
 */
public class Car extends Model<Car> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

        /**
     * 用户id
     */
         private Long userId;

        /**
     * 车的图片
     */
         private Long picture;

        /**
     * 车的品牌
     */
         private String brand;

        /**
     * 车的型号
     */
         private String model;

        /**
     * 车型中文名
     */
         private String modelCn;

        /**
     * 车的牌照
     */
         private String licenseTag;

        /**
     * 车机的唯一标识
     */
         private String carComputerUnique;

        /**
     * 车机的密码
     */
         private String carComputerPassword;

        /**
     * 车机服务商
     */
         private String controlCenterSupplier;

        /**
     * 车机提供商id 1-宝驾 2-智信通
     */
         private Long supplierId;

        /**
     * 车机的厂商
     */
         private String controlCenterFactory;

        /**
     * 车机Sim卡ccid
     */
         private String ccid;

        /**
     * 状态 0 初始化; 10 可使用; 101 待取车; 102 使用中; 103 待整备; 106 已删除 120 工单处理中;（104 调度;110 充电工单派发中;112 维修工单派发中；113 事故工单派发中；114 年检工单派发中；115 失联工单派发中；116 保养中；117 其他工单派发中；118 小电瓶欠压工单派发中；400 车辆有问题转调度；）括号中的状态为 1.0护驾用到的状态
     */
         private Integer status;

        /**
     * 电量
     */
         private Integer electricty;

        /**
     * 续航里程
     */
         private Integer mileage;

        /**
     * 当前总里程
     */
         @TableField("totalMileage")
    private Long totalMileage;

        /**
     * 当前保养公里数
     */
         @TableField("maintainMileage")
    private Long maintainMileage;

        /**
     * 经度
     */
         private Double longitude;

        /**
     * 纬度
     */
         private Double latitude;

        /**
     * 等级
     */
         private Long gradeId;

        /**
     * 存车网点
     */
         private Long parkId;

        /**
     * 保险到期时间
     */
         private LocalDateTime insuranceMaturityTime;

        /**
     * 当前年检的时间
     */
         private LocalDateTime annualSurveyTime;

        /**
     * 创建时间
     */
         private LocalDateTime createTime;

        /**
     * 修改时间
     */
         private LocalDateTime modifyTime;

        /**
     * 版本控制
     */
         private Long version;

        /**
     * 满电标准里程
     */
         private Integer standardMileage;

        /**
     * 司乘险价格
     */
         private Integer companyByRisk;

        /**
     * 不计免赔险价格
     */
         private Integer abatement;

        /**
     * 小电瓶电压值 单位V
     */
         private Double voltage;

        /**
     * 座位
     */
         private Integer seat;

        /**
     * 区号
     */
         private String areaCode;

        /**
     * 是否有断电模块 0-无 1-有
     */
         private Integer elecModule;

        /**
     * geo hash码，用于判断相似坐标
     */
         private String geoCode;

        /**
     * 还车备注
     */
         private String userRemark;

        /**
     * 上线时间
     */
         private LocalDateTime onlineTime;

        /**
     * 车辆当前的地理位置
     */
         private String locationName;

        /**
     * 是否精准定位:0 否  1 精准  2 较精准
     */
         private Integer isAccurate;

        /**
     * 1:上架 2:下架
     */
         private Integer masterStatus;

        /**
     * 0:有工单，但未开门（工单开始）1:空闲2:预约3:在用4:结束5:调度；20：其他；21：车机维修；22：拖车维修；23：维修；24：搭电；25：充电；26：加油；27：洗车；28：配钥匙；29：召回；30：保养；31：拖车维修完成；32：维修完成；33：充电完成；34：保养完成；35：测试
     */
         private Integer slaveStatus;

        /**
     * 地服公司id
     */
         private Integer groundServiceCompanyId;

        /**
     * 车架号
     */
         private String carCode;

        /**
     * 发动机号
     */
         private String carDrivenumber;

        /**
     * 1:出行端2:地服端3:web后台4:定时任务
     */
         private Integer modifySource;

        /**
     * 车机上报时间
     */
         private LocalDateTime reviceTime;

        /**
     * 汽车类型：1 电车，2 油车
     */
         private Integer type;

        /**
     * 状态改变的开始时间
     */
         private LocalDateTime statusChangeStartTime;

        /**
     * 车辆改变的结束时间
     */
         private LocalDateTime statusChangeEndTime;

        /**
     * 百公里油耗
     */
         private String fcph;

        /**
     * 洗车时间
     */
         private LocalDateTime washCarTime;

        /**
     * 还车备注图片
     */
         private Long remarkPic;

        /**
     * 车辆状态，0：待导入；1：导入中；2：导入成功；3：导入失败
     */
         private Integer carStatus;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPicture() {
        return picture;
    }

    public void setPicture(Long picture) {
        this.picture = picture;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelCn() {
        return modelCn;
    }

    public void setModelCn(String modelCn) {
        this.modelCn = modelCn;
    }

    public String getLicenseTag() {
        return licenseTag;
    }

    public void setLicenseTag(String licenseTag) {
        this.licenseTag = licenseTag;
    }

    public String getCarComputerUnique() {
        return carComputerUnique;
    }

    public void setCarComputerUnique(String carComputerUnique) {
        this.carComputerUnique = carComputerUnique;
    }

    public String getCarComputerPassword() {
        return carComputerPassword;
    }

    public void setCarComputerPassword(String carComputerPassword) {
        this.carComputerPassword = carComputerPassword;
    }

    public String getControlCenterSupplier() {
        return controlCenterSupplier;
    }

    public void setControlCenterSupplier(String controlCenterSupplier) {
        this.controlCenterSupplier = controlCenterSupplier;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getControlCenterFactory() {
        return controlCenterFactory;
    }

    public void setControlCenterFactory(String controlCenterFactory) {
        this.controlCenterFactory = controlCenterFactory;
    }

    public String getCcid() {
        return ccid;
    }

    public void setCcid(String ccid) {
        this.ccid = ccid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getElectricty() {
        return electricty;
    }

    public void setElectricty(Integer electricty) {
        this.electricty = electricty;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Long getTotalMileage() {
        return totalMileage;
    }

    public void setTotalMileage(Long totalMileage) {
        this.totalMileage = totalMileage;
    }

    public Long getMaintainMileage() {
        return maintainMileage;
    }

    public void setMaintainMileage(Long maintainMileage) {
        this.maintainMileage = maintainMileage;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public Long getParkId() {
        return parkId;
    }

    public void setParkId(Long parkId) {
        this.parkId = parkId;
    }

    public LocalDateTime getInsuranceMaturityTime() {
        return insuranceMaturityTime;
    }

    public void setInsuranceMaturityTime(LocalDateTime insuranceMaturityTime) {
        this.insuranceMaturityTime = insuranceMaturityTime;
    }

    public LocalDateTime getAnnualSurveyTime() {
        return annualSurveyTime;
    }

    public void setAnnualSurveyTime(LocalDateTime annualSurveyTime) {
        this.annualSurveyTime = annualSurveyTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Integer getStandardMileage() {
        return standardMileage;
    }

    public void setStandardMileage(Integer standardMileage) {
        this.standardMileage = standardMileage;
    }

    public Integer getCompanyByRisk() {
        return companyByRisk;
    }

    public void setCompanyByRisk(Integer companyByRisk) {
        this.companyByRisk = companyByRisk;
    }

    public Integer getAbatement() {
        return abatement;
    }

    public void setAbatement(Integer abatement) {
        this.abatement = abatement;
    }

    public Double getVoltage() {
        return voltage;
    }

    public void setVoltage(Double voltage) {
        this.voltage = voltage;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Integer getElecModule() {
        return elecModule;
    }

    public void setElecModule(Integer elecModule) {
        this.elecModule = elecModule;
    }

    public String getGeoCode() {
        return geoCode;
    }

    public void setGeoCode(String geoCode) {
        this.geoCode = geoCode;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    public LocalDateTime getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(LocalDateTime onlineTime) {
        this.onlineTime = onlineTime;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Integer getIsAccurate() {
        return isAccurate;
    }

    public void setIsAccurate(Integer isAccurate) {
        this.isAccurate = isAccurate;
    }

    public Integer getMasterStatus() {
        return masterStatus;
    }

    public void setMasterStatus(Integer masterStatus) {
        this.masterStatus = masterStatus;
    }

    public Integer getSlaveStatus() {
        return slaveStatus;
    }

    public void setSlaveStatus(Integer slaveStatus) {
        this.slaveStatus = slaveStatus;
    }

    public Integer getGroundServiceCompanyId() {
        return groundServiceCompanyId;
    }

    public void setGroundServiceCompanyId(Integer groundServiceCompanyId) {
        this.groundServiceCompanyId = groundServiceCompanyId;
    }

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    public String getCarDrivenumber() {
        return carDrivenumber;
    }

    public void setCarDrivenumber(String carDrivenumber) {
        this.carDrivenumber = carDrivenumber;
    }

    public Integer getModifySource() {
        return modifySource;
    }

    public void setModifySource(Integer modifySource) {
        this.modifySource = modifySource;
    }

    public LocalDateTime getReviceTime() {
        return reviceTime;
    }

    public void setReviceTime(LocalDateTime reviceTime) {
        this.reviceTime = reviceTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDateTime getStatusChangeStartTime() {
        return statusChangeStartTime;
    }

    public void setStatusChangeStartTime(LocalDateTime statusChangeStartTime) {
        this.statusChangeStartTime = statusChangeStartTime;
    }

    public LocalDateTime getStatusChangeEndTime() {
        return statusChangeEndTime;
    }

    public void setStatusChangeEndTime(LocalDateTime statusChangeEndTime) {
        this.statusChangeEndTime = statusChangeEndTime;
    }

    public String getFcph() {
        return fcph;
    }

    public void setFcph(String fcph) {
        this.fcph = fcph;
    }

    public LocalDateTime getWashCarTime() {
        return washCarTime;
    }

    public void setWashCarTime(LocalDateTime washCarTime) {
        this.washCarTime = washCarTime;
    }

    public Long getRemarkPic() {
        return remarkPic;
    }

    public void setRemarkPic(Long remarkPic) {
        this.remarkPic = remarkPic;
    }

    public Integer getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(Integer carStatus) {
        this.carStatus = carStatus;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Car{" +
        "id=" + id +
        ", userId=" + userId +
        ", picture=" + picture +
        ", brand=" + brand +
        ", model=" + model +
        ", modelCn=" + modelCn +
        ", licenseTag=" + licenseTag +
        ", carComputerUnique=" + carComputerUnique +
        ", carComputerPassword=" + carComputerPassword +
        ", controlCenterSupplier=" + controlCenterSupplier +
        ", supplierId=" + supplierId +
        ", controlCenterFactory=" + controlCenterFactory +
        ", ccid=" + ccid +
        ", status=" + status +
        ", electricty=" + electricty +
        ", mileage=" + mileage +
        ", totalMileage=" + totalMileage +
        ", maintainMileage=" + maintainMileage +
        ", longitude=" + longitude +
        ", latitude=" + latitude +
        ", gradeId=" + gradeId +
        ", parkId=" + parkId +
        ", insuranceMaturityTime=" + insuranceMaturityTime +
        ", annualSurveyTime=" + annualSurveyTime +
        ", createTime=" + createTime +
        ", modifyTime=" + modifyTime +
        ", version=" + version +
        ", standardMileage=" + standardMileage +
        ", companyByRisk=" + companyByRisk +
        ", abatement=" + abatement +
        ", voltage=" + voltage +
        ", seat=" + seat +
        ", areaCode=" + areaCode +
        ", elecModule=" + elecModule +
        ", geoCode=" + geoCode +
        ", userRemark=" + userRemark +
        ", onlineTime=" + onlineTime +
        ", locationName=" + locationName +
        ", isAccurate=" + isAccurate +
        ", masterStatus=" + masterStatus +
        ", slaveStatus=" + slaveStatus +
        ", groundServiceCompanyId=" + groundServiceCompanyId +
        ", carCode=" + carCode +
        ", carDrivenumber=" + carDrivenumber +
        ", modifySource=" + modifySource +
        ", reviceTime=" + reviceTime +
        ", type=" + type +
        ", statusChangeStartTime=" + statusChangeStartTime +
        ", statusChangeEndTime=" + statusChangeEndTime +
        ", fcph=" + fcph +
        ", washCarTime=" + washCarTime +
        ", remarkPic=" + remarkPic +
        ", carStatus=" + carStatus +
        "}";
    }
}
