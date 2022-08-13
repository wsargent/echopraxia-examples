package com.diffbuilder;

import com.tersesystems.echopraxia.api.*;
import com.tersesystems.echopraxia.diff.DiffFieldBuilder;

public class PersonFieldBuilder implements FieldBuilder, DiffFieldBuilder {

  public FieldBuilderResult diff(String name, Person before, Person after) {
    return diff(name, personValue(before), personValue(after));
  }

  public Value<?> personValue(Person p) {
    if (p == null) {
      return Value.nullValue();
    }
    Field name = string("name", p.getName());
    Field age = number("age", p.getAge());
    return Value.object(name, age);
  }
}
