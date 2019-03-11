package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        Component.Builder b=new Component.Builder();
        b.setName(s.next());
        boolean quit=false;
        while(s.hasNext() && !quit){
            String t=s.nextLine();
            System.out.println("T is |"+t+"|");
            if(t.contains("quit")||t.equals("\n")){
                quit=true;
            }else{
                b.addAttr(t);
            }
        }

        Component c=b.build();

        System.out.println();
        System.out.println(c.toString());
    }


    //public static
}


/**
 * Goal is to make this:
 * (ScheduleEditor({
 *         repeatType: this.state.repeatType,
 *         repeatInterval: this.state.repeatInterval,
 *         repeatValues: this.state.repeatValues,
 *         startDate: this.state.startDate,
 *         endDate: this.state.endDate,
 *         times: this.state.times,
 *         changeRepeatType: this.changeRepeatType,
 *         changeRepeatInterval: this.changeRepeatInterval,
 *         changeRepeatValues: this.changeRepeatValues,
 *         changeStartDate: this.changeStartDate,
 *         changeEndDate: this.changeEndDate,
 *         changeTimeHandlerFor: this.changeTimeHandlerFor,
 *         removeTimeHandlerFor: this.removeTimeHandlerFor,
 *         addTime: this.addTime,
 *         startDateBlackoutFunction: this.startDateBlackoutFunction,
 *         endDateBlackoutFunction: this.endDateBlackoutFunction
 *       }))
 *
 *
 * look like this:
*         <ScheduleEditor
*           repeatType= {this.state.repeatType}
*           repeatInterval={this.state.repeatInterval}
*           repeatValues={this.state.repeatValues}
*           startDate={this.state.startDate}
*           endDate={this.state.endDate}
*           times={this.state.times}
*           changeRepeatType={this.changeRepeatType}
*           changeRepeatInterval={this.changeRepeatInterval}
*           changeRepeatValues={this.changeRepeatValues}
*           changeStartDate={this.changeStartDate}
*           changeEndDate={this.changeEndDate}
*           changeTimeHandlerFor={this.changeTimeHandlerFor}
*           removeTimeHandlerFor={this.removeTimeHandlerFor}
*           addTime={this.addTime}
*           startDateBlackoutFunction={this.startDateBlackoutFunction}
*           endDateBlackoutFunction={this.endDateBlackoutFunction}
*         />
 **/