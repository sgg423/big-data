/*******************************************************************************
 *
 * Pentaho Big Data
 *
 * Copyright (C) 2002-2022 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/
package org.pentaho.big.data.kettle.plugins.hive;

import org.pentaho.di.core.plugins.DatabaseMetaPlugin;
import org.pentaho.hadoop.shim.api.cluster.NamedClusterService;
import org.pentaho.hadoop.shim.api.jdbc.DriverLocator;

@DatabaseMetaPlugin( type = "HIVEWAREHOUSE", typeDescription = "Hive Warehouse Connector" )
public class HiveWarehouseDatabaseMeta extends Hive2DatabaseMeta {
  public HiveWarehouseDatabaseMeta( DriverLocator driverLocator, NamedClusterService namedClusterService ) {
    super( driverLocator, namedClusterService );
  }
}
