call mvn assembly:single -Dpackage.version=%1
.\..\Utils\GCUpload.exe -u:kolesnik.nickolay@gmail.com -p:%GC_PASS% -s:"Publishing %1 release" -f:target/Sirius-%1-release.zip -n:sirius-platform