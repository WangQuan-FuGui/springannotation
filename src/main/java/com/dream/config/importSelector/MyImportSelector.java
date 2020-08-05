package com.dream.config.importSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector{

    /**
     *
     * @param annotationMetadata 当前标注@Import注解类的所有注解信息
     * @return 返回值，就是导入容器中的组件全类名
     */
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        return new String[]{"com.dream.config.importEntity.Yellow"};
    }
}
