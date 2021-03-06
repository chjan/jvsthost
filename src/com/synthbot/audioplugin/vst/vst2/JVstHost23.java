/*
 *  Copyright 2007 - 2009 Martin Roth (mhroth@gmail.com)
 *                        Matthew Yee-King
 * 
 *  This file is part of JVstHost.
 *
 *  JVstHost is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  JVstHost is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *  
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with JVstHost.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.synthbot.audioplugin.vst.vst2;

import java.io.File;

import com.synthbot.audioplugin.vst.VstVersion;

public class JVstHost23 extends JVstHost22 {

  protected JVstHost23(File pluginFile, long pluginPtr) {
    super(pluginFile, pluginPtr);
  }
  
  @Override
  public VstVersion getVstVersion() {
    return VstVersion.VST23;
  }
  
  @Override
  public synchronized void turnOn() {
    if (isTurnedOff) {
      resume(vstPluginPtr);
      startProcess(vstPluginPtr);
      isTurnedOff = false;
    }
  }
  
  @Override
  public synchronized void turnOff() {
    if (!isTurnedOff) {
      stopProcess(vstPluginPtr);
      suspend(vstPluginPtr);
      isTurnedOff = true;
    }
  }
  
  protected static native void startProcess(long pluginPtr);
  
  protected static native void stopProcess(long pluginPtr);
  
}
