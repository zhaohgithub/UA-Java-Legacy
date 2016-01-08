 /* Copyright (c) 1996-2015, OPC Foundation. All rights reserved.
   The source code in this file is covered under a dual-license scenario:
     - RCL: for OPC Foundation members in good-standing
     - GPL V2: everybody else
   RCL license terms accompanied with this source code. See http://opcfoundation.org/License/RCL/1.00/
   GNU General Public License as published by the Free Software Foundation;
   version 2 of the License are accompanied with this source code. See http://opcfoundation.org/License/GPLv2
   This source code is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/

package org.opcfoundation.ua.core;

import org.opcfoundation.ua.builtintypes.Structure;
import org.opcfoundation.ua.builtintypes.ExpandedNodeId;
import org.opcfoundation.ua.core.Identifiers;
import org.opcfoundation.ua.utils.ObjectUtils;
import org.opcfoundation.ua.builtintypes.DateTime;
import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.builtintypes.UnsignedInteger;



public class ViewDescription extends Object implements Structure, Cloneable {
	
	public static final ExpandedNodeId ID = new ExpandedNodeId(Identifiers.ViewDescription);
	public static final ExpandedNodeId BINARY = new ExpandedNodeId(Identifiers.ViewDescription_Encoding_DefaultBinary);
	public static final ExpandedNodeId XML = new ExpandedNodeId(Identifiers.ViewDescription_Encoding_DefaultXml);
	
    protected NodeId ViewId;
    protected DateTime Timestamp;
    protected UnsignedInteger ViewVersion;
    
    public ViewDescription() {}
    
    public ViewDescription(NodeId ViewId, DateTime Timestamp, UnsignedInteger ViewVersion)
    {
        this.ViewId = ViewId;
        this.Timestamp = Timestamp;
        this.ViewVersion = ViewVersion;
    }
    
    public NodeId getViewId()
    {
        return ViewId;
    }
    
    public void setViewId(NodeId ViewId)
    {
        this.ViewId = ViewId;
    }
    
    public DateTime getTimestamp()
    {
        return Timestamp;
    }
    
    public void setTimestamp(DateTime Timestamp)
    {
        this.Timestamp = Timestamp;
    }
    
    public UnsignedInteger getViewVersion()
    {
        return ViewVersion;
    }
    
    public void setViewVersion(UnsignedInteger ViewVersion)
    {
        this.ViewVersion = ViewVersion;
    }
    
    /**
      * Deep clone
      *
      * @return cloned ViewDescription
      */
    public ViewDescription clone()
    {
        ViewDescription result = new ViewDescription();
        result.ViewId = ViewId;
        result.Timestamp = Timestamp;
        result.ViewVersion = ViewVersion;
        return result;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        ViewDescription other = (ViewDescription) obj;
        if (ViewId==null) {
            if (other.ViewId != null) return false;
        } else if (!ViewId.equals(other.ViewId)) return false;
        if (Timestamp==null) {
            if (other.Timestamp != null) return false;
        } else if (!Timestamp.equals(other.Timestamp)) return false;
        if (ViewVersion==null) {
            if (other.ViewVersion != null) return false;
        } else if (!ViewVersion.equals(other.ViewVersion)) return false;
        return true;
    }
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((ViewId == null) ? 0 : ViewId.hashCode());
        result = prime * result
                + ((Timestamp == null) ? 0 : Timestamp.hashCode());
        result = prime * result
                + ((ViewVersion == null) ? 0 : ViewVersion.hashCode());
        return result;
    }
    


	public ExpandedNodeId getTypeId() {
		return ID;
	}

	public ExpandedNodeId getXmlEncodeId() {
		return XML;
	}

	public ExpandedNodeId getBinaryEncodeId() {
		return BINARY;
	}
	
	public String toString() {
		return "ViewDescription: "+ObjectUtils.printFieldsDeep(this);
	}

}