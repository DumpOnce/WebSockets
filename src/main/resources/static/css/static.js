/*
var stompClient = null;
var notificationCount = 0;

function goAhead(){
    stompClient.send("app/global",{},JSON.stringify($("#enter").val()))
}

function connect() {
    var socket = new SockJS('/our-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({},  frame => {
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/sending',  message=> {
            showAllUsers()
        });
    });
}
*/

showAllUsers = ()=>{

}


