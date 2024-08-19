@@ECHO OFF
ECHO Here is the computer system information
systeminfo | findstr /c:"OS Name"
systeminfo | findstr /c:"OS Version"
systeminfo | findstr /c:"System Type"
systeminfo | findstr /c:"Total Physical Memory"
wmic cpu get name
wmic diskdrive get name, model, size
wmic path win32_videoController get name
pause