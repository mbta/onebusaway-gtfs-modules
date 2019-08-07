package org.onebusaway.gtfs.model;

import org.onebusaway.csv_entities.schema.annotations.CsvField;
import org.onebusaway.csv_entities.schema.annotations.CsvFields;

@CsvFields(filename = "ignored_alerts.txt", required = false)
public final class IgnoredAlert extends IdentityBean<String> {

  private static final long serialVersionUID = 2L;

  @CsvField(name="alert_id")
  private String id;

  @CsvField(optional = true)
  private String description;

  public IgnoredAlert() {

  }

  public IgnoredAlert(IgnoredAlert a) {
    this.id = a.id;
    this.description = a.description;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String toString() {
    return "<IgnoredAlert " + this.id + ">";
  }
}