function tips(mess) {
    tips(mess, 1500)
}

function tips(mess, t) {
    let hidvalue_str = mess;
    let divWidth = 100;
    let divHeight = 100;
    let iLeft = ($(window).width() - divWidth) / 2;
    let iTop = ($(window).height() - divHeight) / 2 + $(document).scrollTop();
    let divhtml = $("<h1>" + hidvalue_str + "</h1>").css({
        position: 'absolute',
        top: iTop + 'px',
        left: iLeft + 'px',
        display: 'none',
        width: divWidth + 'px',
        height: divHeight + 'px',
        color: 'red',
    });
    divhtml.appendTo('body').fadeIn();
    divhtml.appendTo('body').fadeOut(t);
}

function getDateFormat(t) {
    return jsDateFormatter(new Date(t))
}

function jsDateFormatter(dateInput) {
    let year = dateInput.getFullYear();
    let month = dateInput.getMonth() + 1;
    let theDate = dateInput.getDate();

    let hour = dateInput.getHours();
    let minute = dateInput.getMinutes();
    let second = dateInput.getSeconds();

    if (month < 10) {
        month = '0' + month;
    }

    if (theDate < 10) {
        theDate = '0' + theDate;
    }
    if (hour < 10) {
        hour = '0' + hour;
    }
    if (minute < 10) {
        minute = '0' + minute;
    }
    if (second < 10) {
        second = '0' + second;
    }
    return year + "-" + month + "-" + theDate + " " + hour + ":" + minute + ":" + second;
}