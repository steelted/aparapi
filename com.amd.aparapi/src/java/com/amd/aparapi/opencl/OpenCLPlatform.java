package com.amd.aparapi.opencl;

import java.util.ArrayList;
import java.util.List;

import com.amd.aparapi.device.OpenCLDevice;
import com.amd.aparapi.jni.OpenCLJNI;

public class OpenCLPlatform extends OpenCLJNI {

   private final String version;

   private final String vendor;

   private final String name;

   private final List<OpenCLDevice> devices = new ArrayList<OpenCLDevice>();

   /**
    * Minimal constructor
    * 
    * @param _platformId
    * @param _version
    * @param _vendor
    * @param _name
    */
   public OpenCLPlatform(String _version, String _vendor, String _name) {
      version = _version;
      vendor = _vendor;
      name = _name;
   }

   public void addOpenCLDevice(OpenCLDevice device) {
      devices.add(device);
   }

   public List<OpenCLDevice> getOpenCLDevices() {
      return (devices);
   }

   public List<OpenCLPlatform> getOpenCLPlatforms() {
      if (OpenCLLoader.isOpenCLAvailable()) {
         return (getPlatforms());
      } else {
         return (new ArrayList<OpenCLPlatform>());
      }
   }

   public String getName() {
      return (name);
   }

   public String getVersion() {
      return (version);
   }

   public String getVendor() {
      return (vendor);
   }

   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder();
      sb.append("PlatformId ");
      sb.append("\nName:");
      sb.append(vendor);
      sb.append("\nVersion:");
      sb.append(version);

      return sb.toString();
   }
}
