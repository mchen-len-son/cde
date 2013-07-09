
package pt.webdetails.cdf.dd.model.core.validation;

import org.apache.commons.lang.StringUtils;

/**
 * @author dcleao
 */
public final class DuplicateAttributeError extends ValidationError
{
  private final String _attributeName;

  public DuplicateAttributeError(String attributeName)
  {
    if(StringUtils.isEmpty(attributeName)) { throw new IllegalArgumentException("attributeName"); }
    
    this._attributeName = attributeName;
  }

  public String getAttributeName()
  {
    return this._attributeName;
  }

  @Override
  public String toString()
  {
    return "Attribute '" + this._attributeName + "' is already defined.";
  }
}