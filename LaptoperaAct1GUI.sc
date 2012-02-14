// version 0.01-alpha

LaptoperaAct1GUI {

	var <win, api, view, matrix;

	* max { |net_api, port = 8000, show = true, win|
			^super.new.maxinit(net_api, port, show, win)
	}

	maxinit {|net_api, port = 8000, show, window|

		api = net_api;
		//win = window ? Window("Act1");
		
		matrix = NetworkGui.make(api, [\amp], {|gui, amp|

			var net, param1, param2, param3, param4, param5, antisocial;

			net = NetAddr("127.0.0.1", port);
			
			param1 = gui.addRemote('param1');
			param1.sp(0, 0, 1, 0, \lin, gui);
			param1.guitype_(\voter);
			param1.action = {|p| net.sendMsg("/param1", p.value)};

			param2 = gui.addRemote('param2');
			param2.sp(0, 0, 1, 0, \lin, gui);
			param2.guitype_(\voter);
			param2.action = {|p| net.sendMsg("/param2", p.value)};

			param3 = gui.addRemote('param3');
			param3.sp(0, 0, 1, 0, \lin, gui);
			param3.guitype_(\voter);
			param3.action = {|p| net.sendMsg("/param3", p.value)};

			param4 = gui.addRemote('param4');
			param4.sp(0, 0, 1, 0, \lin, gui);
			param4.guitype_(\voter);
			param4.action = {|p| net.sendMsg("/param4", p.value)};

			param5 = gui.addRemote('param5');
			param5.sp(0, 0, 1, 0, \lin, gui);
			param5.guitype_(\voter);
			param5.action = {|p| net.sendMsg("/param5", p.value)};

			antisocial = gui.addLocal('antisocial');
			antisocial.sp(0, 0, 1, 0, \lin, gui);
		}).show(win);
	}
}
/*
	(


var api, chat, matrix, win;


api = NetAPI.broadcast("Nick");

chat = BileChat(api);

matrix = NetworkGui.make(api, [\amp], {|gui, amp, freq|

var dur;


dur = gui.addRemote(\dur);

dur.sp(1, 0.1, 5, 0, \lin, gui); //default, min, max, step size, warp, changer

gui.pattern_(

Pbind(

\freq, freq,

\amp, amp,

\dur, dur

)

);


}).show(chat.win);

)
*/