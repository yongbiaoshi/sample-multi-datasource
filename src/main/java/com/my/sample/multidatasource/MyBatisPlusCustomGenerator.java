package com.my.sample.multidatasource;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MyBatisPlusCustomGenerator {

    // 输出目录
    private static String outPutDir = "/app/git_repo/github/multi-datasource/src/main/java";
    private static String author = "shiyongbiao";
    private static String jdbcUrl = "jdbc:mysql://localhost:3306/ground?useUnicode=true&characterEncoding=UTF-8&generateSimpleParameterMetadata=true";
    private static String username = "root";
    private static String password = "root";

    private static String parent = "com.my.sample.multidatasource";

    private static String[] include = new String[]{"car"};

    private static String[] exclude = new String[]{};

    public static void main(String[] args) throws InterruptedException {
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(outPutDir);
        gc.setFileOverride(true);
        gc.setActiveRecord(true);
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        gc.setAuthor(author);

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        /*dsc.setTypeConvert(new MySqlTypeConvert(){
            // 自定义数据库表字段类型转换【可选】
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                System.out.println("转换类型：" + fieldType);
                return super.processTypeConvert(fieldType);
            }
        });*/

        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUrl(jdbcUrl);
        dsc.setUsername(username);
        dsc.setPassword(password);
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        // strategy.setTablePrefix(new String[] { "tlog_", "tsys_" });// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setInclude(include); // 需要生成的表
        strategy.setExclude(exclude); // 排除生成的表
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(parent);
        pc.setEntity("entity.po");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setMapper("dao.mapper.secondary");
        pc.setXml("xml");
        mpg.setPackageInfo(pc);


        // 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/templates 下面内容修改，
        // 放置自己项目的 src/main/resources/templates 目录下, 默认名称一下可以不配置，也可以自定义模板名称
        TemplateConfig tc = new TemplateConfig();
        tc.setController(null);
        //        tc.setEntity("entity.po");
        //        tc.setMapper("mapper.mapper");
        //        tc.setXml("xml");
        //        tc.setService("service");
        //        tc.setServiceImpl("service.impl");
        //        tc.setController(null);
        mpg.setTemplate(tc);

        // 如上任何一个模块如果设置 空 OR Null 将不生成该模块。
        mpg.setTemplate(tc);

        // 执行生成
        mpg.execute();
    }

}
