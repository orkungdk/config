/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.model;

import lombok.Getter;
import lombok.Setter;
import model.AbstractBo;

/**
 * @author orkun.gedik
 */
@Getter
@Setter
public class ConfigurationProperty extends AbstractBo {

  private String propertyKey;

  private String propertyValue;

}
