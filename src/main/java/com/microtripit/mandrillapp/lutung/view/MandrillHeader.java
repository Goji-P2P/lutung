package com.microtripit.mandrillapp.lutung.view;

import java.util.Arrays;
import java.util.List;

public class MandrillHeader {

  private List<String> values;

  public MandrillHeader(List<String> values) {
    this.values = values;
  }

  public MandrillHeader(String... values) {
    this.values = Arrays.asList(values);
  }

  public List<String> getValues() {
    return values;
  }

  public String getFirstValue() {
    if (values == null || values.isEmpty()) {
      return null;
    }

    return values.get(0);
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public void setValues(String... value) {
    this.values = Arrays.asList(value);
  }
}
