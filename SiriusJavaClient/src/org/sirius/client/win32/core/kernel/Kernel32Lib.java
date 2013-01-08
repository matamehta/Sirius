/**
 * Kernel32Lib.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.kernel;

public interface Kernel32Lib extends java.rmi.Remote {
	public boolean closeHandle(org.sirius.client.win32.core.kernel.Handle arg0)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.kernel.Pointer localFree(
			org.sirius.client.win32.core.kernel.Pointer arg0)
			throws java.rmi.RemoteException;

	public boolean deleteFile(java.lang.String arg0)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.kernel.Handle createFile(
			java.lang.String arg0, int arg1, int arg2,
			org.sirius.client.win32.core.kernel.SecurityATTRIBUTES arg3,
			int arg4, int arg5, org.sirius.client.win32.core.kernel.Handle arg6)
			throws java.rmi.RemoteException;

	public int getDriveType(java.lang.String arg0)
			throws java.rmi.RemoteException;

	public boolean moveFileEx(java.lang.String arg0, java.lang.String arg1,
			org.sirius.client.win32.core.kernel.Dword arg2)
			throws java.rmi.RemoteException;

	public int setFileTime(org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.Filetime arg1,
			org.sirius.client.win32.core.kernel.Filetime arg2,
			org.sirius.client.win32.core.kernel.Filetime arg3)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.kernel.Handle createIoCompletionPort(
			org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.Handle arg1,
			org.sirius.client.win32.core.kernel.Pointer arg2, int arg3)
			throws java.rmi.RemoteException;

	public boolean getQueuedCompletionStatus(
			org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.IntByReference arg1,
			org.sirius.client.win32.core.kernel.UlongPTRByReference arg2,
			org.sirius.client.win32.core.kernel.PointerByReference arg3,
			int arg4) throws java.rmi.RemoteException;

	public boolean postQueuedCompletionStatus(
			org.sirius.client.win32.core.kernel.Handle arg0, int arg1,
			org.sirius.client.win32.core.kernel.Pointer arg2,
			org.sirius.client.win32.core.kernel.Overlapped arg3)
			throws java.rmi.RemoteException;

	public boolean createDirectory(java.lang.String arg0,
			org.sirius.client.win32.core.kernel.SecurityATTRIBUTES arg1)
			throws java.rmi.RemoteException;

	public int getFileAttributes(java.lang.String arg0)
			throws java.rmi.RemoteException;

	public int formatMessage(int arg0,
			org.sirius.client.win32.core.kernel.Pointer arg1, int arg2,
			int arg3, org.sirius.client.win32.core.kernel.Buffer arg4,
			int arg5, org.sirius.client.win32.core.kernel.Pointer arg6)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.kernel.Handle getCurrentProcess()
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.kernel.Handle getCurrentThread()
			throws java.rmi.RemoteException;

	public boolean setFileAttributes(java.lang.String arg0,
			org.sirius.client.win32.core.kernel.Dword arg1)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.kernel.Handle createFileMapping(
			org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.SecurityATTRIBUTES arg1,
			int arg2, int arg3, int arg4, java.lang.String arg5)
			throws java.rmi.RemoteException;

	public boolean deviceIoControl(
			org.sirius.client.win32.core.kernel.Handle arg0, int arg1,
			org.sirius.client.win32.core.kernel.Pointer arg2, int arg3,
			org.sirius.client.win32.core.kernel.Pointer arg4, int arg5,
			org.sirius.client.win32.core.kernel.IntByReference arg6,
			org.sirius.client.win32.core.kernel.Pointer arg7)
			throws java.rmi.RemoteException;

	public boolean duplicateHandle(
			org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.Handle arg1,
			org.sirius.client.win32.core.kernel.Handle arg2,
			org.sirius.client.win32.core.kernel.HandleByReference arg3,
			int arg4, boolean arg5, int arg6) throws java.rmi.RemoteException;

	public int formatMessage2(int arg0,
			org.sirius.client.win32.core.kernel.Pointer arg1, int arg2,
			int arg3, org.sirius.client.win32.core.kernel.Pointer arg4,
			int arg5, org.sirius.client.win32.core.kernel.Pointer arg6)
			throws java.rmi.RemoteException;

	public int formatMessage3(int arg0,
			org.sirius.client.win32.core.kernel.Pointer arg1, int arg2,
			int arg3,
			org.sirius.client.win32.core.kernel.PointerByReference arg4,
			int arg5, org.sirius.client.win32.core.kernel.Pointer arg6)
			throws java.rmi.RemoteException;

	public boolean getComputerName(org.apache.axis.types.UnsignedShort[] arg0,
			org.sirius.client.win32.core.kernel.IntByReference arg1)
			throws java.rmi.RemoteException;

	public int getCurrentProcessId() throws java.rmi.RemoteException;

	public int getCurrentThreadId() throws java.rmi.RemoteException;

	public boolean getExitCodeProcess(
			org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.IntByReference arg1)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.kernel.Hmodule getModuleHandle(
			java.lang.String arg0) throws java.rmi.RemoteException;

	public int getProcessVersion(int arg0) throws java.rmi.RemoteException;

	public int getShortPathName(java.lang.String arg0,
			org.apache.axis.types.UnsignedShort[] arg1, int arg2)
			throws java.rmi.RemoteException;

	public boolean getVersionEx2(
			org.sirius.client.win32.core.kernel.Osversioninfoex arg0)
			throws java.rmi.RemoteException;

	public boolean globalMemoryStatusEx(
			org.sirius.client.win32.core.kernel.Memorystatusex arg0)
			throws java.rmi.RemoteException;

	public boolean isWow64Process(
			org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.IntByReference arg1)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.kernel.Pointer mapViewOfFile(
			org.sirius.client.win32.core.kernel.Handle arg0, int arg1,
			int arg2, int arg3, int arg4) throws java.rmi.RemoteException;

	public boolean setHandleInformation(
			org.sirius.client.win32.core.kernel.Handle arg0, int arg1, int arg2)
			throws java.rmi.RemoteException;

	public boolean terminateProcess(
			org.sirius.client.win32.core.kernel.Handle arg0, int arg1)
			throws java.rmi.RemoteException;

	public boolean unmapViewOfFile(
			org.sirius.client.win32.core.kernel.Pointer arg0)
			throws java.rmi.RemoteException;

	public int waitForSingleObject(
			org.sirius.client.win32.core.kernel.Handle arg0, int arg1)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.kernel.Handle createToolhelp32Snapshot(
			org.sirius.client.win32.core.kernel.Dword arg0,
			org.sirius.client.win32.core.kernel.Dword arg1)
			throws java.rmi.RemoteException;

	public int getEnvironmentVariable(java.lang.String arg0,
			org.apache.axis.types.UnsignedShort[] arg1, int arg2)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.kernel.Dword getLogicalDriveStrings(
			org.sirius.client.win32.core.kernel.Dword arg0,
			org.apache.axis.types.UnsignedShort[] arg1)
			throws java.rmi.RemoteException;

	public boolean setEnvironmentVariable(java.lang.String arg0,
			java.lang.String arg1) throws java.rmi.RemoteException;

	public int waitForMultipleObjects(int arg0,
			org.sirius.client.win32.core.kernel.Handle[] arg1, boolean arg2,
			int arg3) throws java.rmi.RemoteException;

	public boolean copyFile(java.lang.String arg0, java.lang.String arg1,
			boolean arg2) throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.kernel.Handle createEvent(
			org.sirius.client.win32.core.kernel.SecurityATTRIBUTES arg0,
			boolean arg1, boolean arg2, java.lang.String arg3)
			throws java.rmi.RemoteException;

	public int getFileType(org.sirius.client.win32.core.kernel.Handle arg0)
			throws java.rmi.RemoteException;

	public int getLastError() throws java.rmi.RemoteException;

	public int getProcessId(org.sirius.client.win32.core.kernel.Handle arg0)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.kernel.Dword getTempPath(
			org.sirius.client.win32.core.kernel.Dword arg0,
			org.apache.axis.types.UnsignedShort[] arg1)
			throws java.rmi.RemoteException;

	public int getTickCount() throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.kernel.Dword getVersion()
			throws java.rmi.RemoteException;

	public boolean getVersionEx(
			org.sirius.client.win32.core.kernel.Osversioninfo arg0)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.kernel.Pointer globalFree(
			org.sirius.client.win32.core.kernel.Pointer arg0)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.kernel.Pointer localAlloc(int arg0,
			int arg1) throws java.rmi.RemoteException;

	public boolean moveFile(java.lang.String arg0, java.lang.String arg1)
			throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.kernel.Handle openProcess(int arg0,
			boolean arg1, int arg2) throws java.rmi.RemoteException;

	public org.sirius.client.win32.core.kernel.Handle openThread(int arg0,
			boolean arg1, int arg2) throws java.rmi.RemoteException;

	public boolean pulseEvent(org.sirius.client.win32.core.kernel.Handle arg0)
			throws java.rmi.RemoteException;

	public boolean readFile(org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.Buffer arg1, int arg2,
			org.sirius.client.win32.core.kernel.IntByReference arg3,
			org.sirius.client.win32.core.kernel.Overlapped arg4)
			throws java.rmi.RemoteException;

	public boolean readFile2(org.sirius.client.win32.core.kernel.Handle arg0,
			org.sirius.client.win32.core.kernel.Pointer arg1, int arg2,
			org.sirius.client.win32.core.kernel.IntByReference arg3,
			org.sirius.client.win32.core.kernel.Overlapped arg4)
			throws java.rmi.RemoteException;

	public boolean setEvent(org.sirius.client.win32.core.kernel.Handle arg0)
			throws java.rmi.RemoteException;

	public void setLastError(int arg0) throws java.rmi.RemoteException;

	public boolean writeFile(org.sirius.client.win32.core.kernel.Handle arg0,
			byte[] arg1, int arg2,
			org.sirius.client.win32.core.kernel.IntByReference arg3,
			org.sirius.client.win32.core.kernel.Overlapped arg4)
			throws java.rmi.RemoteException;
}
