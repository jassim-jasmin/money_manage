"# money_manag1e"
adb over wifi
1. connect usb
2. adb tcpip 5555

Connect device over wifi
1. adb connect 192.168.0.101:5555
2. adb disconnect 192.168.0.101:5555

To discover ip
1. adb shell ip -f inet addr show wlan0
adb usb