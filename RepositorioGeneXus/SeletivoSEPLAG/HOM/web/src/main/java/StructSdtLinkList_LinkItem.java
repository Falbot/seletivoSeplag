import com.genexus.*;

public final  class StructSdtLinkList_LinkItem implements Cloneable, java.io.Serializable
{
   public StructSdtLinkList_LinkItem( )
   {
      this( -1, new ModelContext( StructSdtLinkList_LinkItem.class ));
   }

   public StructSdtLinkList_LinkItem( int remoteHandle ,
                                      ModelContext context )
   {
      gxTv_SdtLinkList_LinkItem_Caption = "" ;
      gxTv_SdtLinkList_LinkItem_Url = "" ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public String getCaption( )
   {
      return gxTv_SdtLinkList_LinkItem_Caption ;
   }

   public void setCaption( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtLinkList_LinkItem_Caption = value ;
   }

   public String getUrl( )
   {
      return gxTv_SdtLinkList_LinkItem_Url ;
   }

   public void setUrl( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtLinkList_LinkItem_Url = value ;
   }

   protected byte sdtIsNull ;
   protected String gxTv_SdtLinkList_LinkItem_Caption ;
   protected String gxTv_SdtLinkList_LinkItem_Url ;
}

