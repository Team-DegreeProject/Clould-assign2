
window.onload = function() {
    var Record = document.getElementById("record");
    var Command = document.getElementById("command");
    var Command_sub = document.getElementById("command_sub");
    Command_sub.onclick = function () {
        //定义空字符串
        var str = "";
        if (Command.value == "") {
            // 消息为空时弹窗
            alert("massage can not be empty");
            return;
        }
        $.post("/Guest/command",
            {
                command: Command.value
            },
            function(result){
                str = '<div><span>' + result + '</span></div>';
                var re=/\r\n/;
                str=str.replace(re,"");
                if(str==""){
                    Record.innerHTML = "There is no result";
                }
                Record.innerHTML = "---"+str+"-----";
            });

    }
};