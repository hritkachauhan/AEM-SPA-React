import React from 'react';
import { MapTo } from '@adobe/aem-react-editable-components';
import Header from '../Header/Header'; // Adjusted import path
require('./Banner.css');

export const CustomEditConfig = {
    emptyLabel: 'Banner',

    isEmpty: function (props) {
        return !props || !props.title;
    }
};

export default function Banner(props) {
    if (CustomEditConfig.isEmpty(props)) {
        return <div><h1>Empty</h1></div>;
    }

    const hasBannerImg = !!props.bannerImg;
    const hasBannerImg2 = !!props.bannerImg2;

    const sectionStyle = {
        position: "relative",
        width: "100%",
        height: hasBannerImg2 ? "370px" : (hasBannerImg ? "765px" : "auto"),
        overflow: "hidden" // Ensure no overflow issues
    };

    const bannerStyle = {
        backgroundImage: hasBannerImg ? `linear-gradient(rgba(6, 10, 27, 0.74), rgba(6, 10, 27, 0.74)), url(${props.bannerImg})` : undefined,
        height:"765px",
        backgroundPosition: "center",
        backgroundSize: "cover",
        position: hasBannerImg2 ? "absolute" : "relative", // Adjust based on the presence of bannerImg2
         top: "0", // Move banner down if image2 is present
         left: "0",
        width: "100%",
        zIndex: hasBannerImg2 ? "0" : "1",
    };

     const headerStyle = {
            backgroundImage: hasBannerImg2 ? `linear-gradient(rgba(4, 9, 30, 0.7), rgba(4, 9, 30, 0.7)), url(${props.bannerImg2})` : undefined,
            height: "370px", // Fixed height for the header image
            backgroundPosition: "center",
            backgroundSize: "cover",
            width: "100%",
            top: "0", // Move banner down if image2 is present
                     left: "0",
            position: "absolute", // Changed to relative to keep it above the main banner
            zIndex: "1" // Above the main banner
        };

    const textBoxStyle = {
            position: "absolute",
            top: hasBannerImg2 ? "66%" : "40%", // Adjust top value based on presence of bannerImg2
            left: "50%",
             transform: "translate(-50%, -50%)", // Center horizontally and vertically
            zIndex: "2", // Ensure text box is above the banner
            textAlign: "center",
            padding: "20px",
            color: "#fff",
        };
        const h1Style = {
                fontSize: hasBannerImg2 ? "2rem" : "4rem", // Adjust size as needed
                marginBottom: hasBannerImg2?"228px":"60px",// Adjust line-height to control text spacing
                marginTop: hasBannerImg2?"50px":"172px"// Adjust line-height to control
            };
    return (
        <section style={sectionStyle}>

            {hasBannerImg2 && <div className="sub-header" style={headerStyle}></div>}
            {hasBannerImg && <div className="banner" style={bannerStyle}></div>}

            <div className="text-box"  style={textBoxStyle}>
                        <Header logo={props.headerLogo} link={props.link} />

                <h1 style={h1Style}>{props.title}</h1>
                <div className="desc-box">
                    <p dangerouslySetInnerHTML={{ __html: props.bannerText }} />
                </div>
                <a href={`${props.btnLink}.html`} className="hero-btn">{props.btnTitle}</a>
            </div>
        </section>
    );
}

MapTo('spa-react/components/content/baner')(Banner, CustomEditConfig);
