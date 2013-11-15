/**
 * Created by Vicky Gonsalves on 11/15/13.
 * i-XL Technologies, Mumbai, India
 * +91-8097598395
 * http://stackoverflow.com/users/1548301/vicky-gonsalves
 */


window.changeOrientation = function (mode) {
    try {
        cordova.exec(function (winParam) {
            }, function (error) {
            }, "OrientationChanger",
            "changeorientation", [mode]);
    } catch (e) {
        console.log("cannot change orientation in native browsers");
    }
}
