package com.blossom_project.generator.configuration;

import com.blossom_project.generator.configuration.model.Field;
import com.blossom_project.generator.configuration.model.impl.DefaultField;

public class LongFieldBuilder extends FieldBuilder<LongFieldBuilder> {

  LongFieldBuilder(FieldsBuilder parent, String name) {
    super(parent, name, Long.class, "long");
  }

  @Override
  Field build() {
    return new DefaultField(name, columnName, className, jdbcType, required, updatable, nullable,
      defaultValue, searchable);
  }
}