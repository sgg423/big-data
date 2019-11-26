/*******************************************************************************
 *
 * Pentaho Big Data
 *
 * Copyright (C) 2002-2019 by Hitachi Vantara : http://www.pentaho.com
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

package org.pentaho.amazon.s3;

import org.apache.commons.vfs2.FileSystemOptions;
import org.eclipse.swt.widgets.Shell;
import org.pentaho.di.core.variables.VariableSpace;
import org.pentaho.di.ui.vfs.VfsFileChooserHelper;
import org.pentaho.s3a.vfs.S3AFileProvider;
import org.pentaho.vfs.ui.VfsFileChooserDialog;


public class S3AVfsFileChooserHelper extends VfsFileChooserHelper {

  public S3AVfsFileChooserHelper( Shell shell, VfsFileChooserDialog fileChooserDialog, VariableSpace variableSpace ) {
    super( shell, fileChooserDialog, variableSpace );
    setDefaultScheme( S3AFileProvider.SCHEME );
    setSchemeRestriction( S3AFileProvider.SCHEME );
  }

  public S3AVfsFileChooserHelper( Shell shell, VfsFileChooserDialog fileChooserDialog, VariableSpace variableSpace,
                                  FileSystemOptions fileSystemOptions ) {
    super( shell, fileChooserDialog, variableSpace, fileSystemOptions );
    setDefaultScheme( S3AFileProvider.SCHEME );
    setSchemeRestriction( S3AFileProvider.SCHEME );
  }

  @Override
  protected boolean returnsUserAuthenticatedFileObjects() {
    return true;
  }
}
